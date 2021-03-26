package com.huawei.service.impl;

import com.huawei.service.IAccountService;

import java.util.Date;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 10:34
 * @desc set方法注入
 */
public class AccountServiceImpl2 implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println(name+","+age+","+birthday);
    }
}
