package com.huawei.ui;

import com.huawei.dao.IAccountDao;
import com.huawei.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 9:40
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        //创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService aService = (IAccountService) ac.getBean("accountService");
        System.out.println(aService);
        IAccountDao aDao = (IAccountDao) ac.getBean("accountDao");
        System.out.println(aDao);
    }
}
