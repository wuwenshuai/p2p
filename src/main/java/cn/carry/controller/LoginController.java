package cn.carry.controller;

import cn.carry.service.LoginService;
import cn.carry.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 13:51
 * @Description:
 */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    //注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Result register(String userName,String password){

        Result result = loginService.register(userName, password);
        return result;

    }

    /**
     * 后台首页
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "main";
    }





}
