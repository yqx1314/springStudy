package com.huawei.service.impl;

import com.huawei.dao.IAccountDao;
import com.huawei.factory.BeanFactory;
import com.huawei.service.IAccountService;


/**
 * 账户的业务层实现类
 * @author yqx
 */
public class AccountServiceImpl implements IAccountService {

//    private IAccountDao accountDao = new AccountDaoImpl();

    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

//    private int i = 1;

    @Override
    public void  saveAccount(){
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
