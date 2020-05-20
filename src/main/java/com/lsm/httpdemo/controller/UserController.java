package com.lsm.httpdemo.controller;

import com.lsm.httpdemo.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
        User user=new User();
        user.setId(8L);
        user.setUserName("zhangsan");
        user.setName("张三1111");
        user.setAge(18);
        user.setSex(1);
        user.setBirthday(new Date());
        user.setNote("一名程序员");
        return user;
    }
}
