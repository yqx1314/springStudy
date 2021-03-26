package com.huawei.service.impl;

import com.huawei.service.IAccountService;

import java.util.Date;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 10:19
 * @desc 构造函数注入
 */
public class AccountServiceImpl implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println(name+","+age+","+birthday);
    }
}
