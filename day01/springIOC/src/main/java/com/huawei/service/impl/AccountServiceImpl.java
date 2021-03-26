package com.huawei.service.impl;

import com.huawei.dao.IAccountDao;
import com.huawei.dao.impl.AccountDaoImpl;
import com.huawei.service.IAccountService;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 9:30
 * @desc
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao = (IAccountDao) new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
