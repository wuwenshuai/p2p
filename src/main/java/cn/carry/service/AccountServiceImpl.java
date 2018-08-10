package cn.carry.service;

import cn.carry.domain.Account;
import cn.carry.mapper.AccountMapper;
import cn.carry.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 17:44
 * @Description:
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public Result addAcount(Account account) {
        int i = accountMapper.insertSelective(account);
        if (i<0){
            return new Result(false,"添加账户失败");
        }
        return new Result(true ,"添加账户成功");
    }
}
