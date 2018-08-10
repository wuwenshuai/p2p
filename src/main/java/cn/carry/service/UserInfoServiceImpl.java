package cn.carry.service;

import cn.carry.domain.Userinfo;
import cn.carry.mapper.UserinfoMapper;
import cn.carry.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 18:31
 * @Description:
 */


@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public Result addUserInfo(Userinfo userinfo) {
        int i = userinfoMapper.insertSelective(userinfo);
        if (i<0){
            return new Result(false,"添加userInfo失败");
        }
        return new Result(true ,"添加userInfo成功");

    }
}
