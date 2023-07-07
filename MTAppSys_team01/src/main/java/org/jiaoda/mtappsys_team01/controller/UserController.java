package org.jiaoda.mtappsys_team01.controller;

import org.jiaoda.mtappsys_team01.biz.UserBiz;
import org.jiaoda.mtappsys_team01.entity.User;
import org.jiaoda.mtappsys_team01.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    //注入用户业务逻辑层对象
    @Autowired
    private UserBiz userBiz;

    //登录
    @PostMapping("/login")
    @ResponseBody
    public JSONResult login(String username, String password){
        //调用biz层getUserByName（）
        User user = userBiz.getUserByName(username);
        if(user!=null){//用户存在
            if(user.getPassword().equals(password)){//密码正确
                return JSONResult.ok(user);
            }else{
                return JSONResult.errorMsg("密码错误");
            }
        }else{//用户不存在
            return JSONResult.errorMsg("用户不存在");
        }
    }

    @PostMapping("/register")
    @ResponseBody
    public JSONResult createUser(User user){
        //调用业务逻辑层中创建用户方法
        if(userBiz.createUser(user)){//用户创建成功
            return JSONResult.ok(user);
        }else{
            return JSONResult.errorMsg("注册失败");
        }
    }



}
