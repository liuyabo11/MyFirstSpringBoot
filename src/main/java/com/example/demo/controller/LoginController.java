package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.bo.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

//    @Autowired
//    LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestBody UserInfo userInfo){
        System.out.println("登录对象信息为："+ userInfo+"====="+JSON.toJSONString(userInfo));
//        UserInfo loginUserInfo = loginService.login(userInfo.getUserName(),userInfo.getPassword());
        return "登陆成功!";
    }

    @RequestMapping("/login2")
    public String login2(@RequestParam String userName){
        System.out.println("登录对象信息为："+ JSON.toJSONString(userName));
        return "登陆成功!";
    }

    @RequestMapping("/login3")
    public String login3(@RequestBody UserInfo userInfo,@RequestParam String userName){
        System.out.println("登录对象信息为："+ JSON.toJSONString(userInfo));
        System.out.println("登录对象信息为："+ JSON.toJSONString(userName));
        return "登陆成功!";
    }

    @RequestMapping("/login4")
    public String login4(@RequestParam String userName){
        System.out.println("登录对象信息为："+ JSON.toJSONString(userName));
        return "登陆成功!";
    }

}
