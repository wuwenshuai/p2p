package cn.carry.service;

import cn.carry.domain.Account;
import cn.carry.util.Result;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 17:44
 * @Description:
 */
public interface AccountService {

    //添加账户
    Result addAcount(Account account);
}
