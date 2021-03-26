package com.huawei.ui;

import com.huawei.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 10:31
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //构造函数注入
        //IAccountService as = (IAccountService) ac.getBean("accountService");
        //set方法注入
        //IAccountService as = (IAccountService) ac.getBean("accountService2");
        //p名称方法注入
        //IAccountService as = (IAccountService) ac.getBean("accountService3");
        //给集合注入数据
        IAccountService as = (IAccountService) ac.getBean("accountService4");
        as.saveAccount();
    }
}
