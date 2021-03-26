package com.huawei.dao.impl;


import com.huawei.dao.IAccountDao;

/**
 * 账户的持久层实现类
 * @author yqx
 */
public class AccountDaoImpl implements IAccountDao {

    @Override
    public  void saveAccount(){

        System.out.println("保存了账户");
    }
}
