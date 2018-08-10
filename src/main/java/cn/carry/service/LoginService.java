package cn.carry.service;

import cn.carry.util.Result;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 15:55
 * @Description:
 */
public interface LoginService {

    // 注册信息
    Result register(String userName, String passWord);
}
