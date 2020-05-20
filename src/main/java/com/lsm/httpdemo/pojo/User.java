package com.lsm.httpdemo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;
    private String userName;
    private String name;
    private int age;
    private int sex;
    private Date birthday;
    private String note;
}
