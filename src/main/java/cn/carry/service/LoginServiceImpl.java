package cn.carry.service;

import cn.carry.domain.Account;
import cn.carry.domain.Logininfo;
import cn.carry.domain.LogininfoExample;
import cn.carry.domain.Userinfo;
import cn.carry.mapper.LogininfoMapper;
import cn.carry.util.MD5;
import cn.carry.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 16:14
 * @Description:
 */


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LogininfoMapper logininfoMapper;

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserInfoService userInfoService;



    @Override
    public Result register(String userName, String passWord) {

        //先判断用户名是否已经注册过
        LogininfoExample logininfoExample = new LogininfoExample();
        LogininfoExample.Criteria criteria = logininfoExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<Logininfo> logininfoList = logininfoMapper.selectByExample(logininfoExample);
        if (logininfoList.size()>0 &&logininfoList!=null){
            //用户名已经存在
            return new Result(false,"用户名已经存在");
        }else {

            //注册用户
            Logininfo logininfo = new Logininfo();
            logininfo.setUsername(userName);
            //密码加密

            logininfo.setPassword(MD5.encode(passWord));
            logininfo.setAdmin(false);
            logininfo.setState((byte) Logininfo.STATE_NORMAL);
            int i = logininfoMapper.insertSelective(logininfo);

            System.out.println("id:"+logininfo.getId()+"----------");
            if (i<=0){
                return new Result(false,"注册失败");
            }else {

                //初始化账户信息和userInfo
                Account account = new Account();
                account.setId(logininfo.getId());
                accountService.addAcount(account);
                //初始化userInfo
                Userinfo userinfo = new Userinfo();
                userinfo.setId(logininfo.getId());
                userInfoService.addUserInfo(userinfo);
                return new Result(true ,"注册成功");
            }
        }

    }
}
