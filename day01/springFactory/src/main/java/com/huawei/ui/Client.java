package com.huawei.ui;

import com.huawei.factory.BeanFactory;
import com.huawei.service.IAccountService;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 14:35
 * @desc 模拟一个表现层钓鱼业务层
 */
public class Client {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
    }
}
