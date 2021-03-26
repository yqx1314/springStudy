package com.huawei.dao.impl;

import com.huawei.dao.IAccountDao;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 9:32
 * @desc
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
