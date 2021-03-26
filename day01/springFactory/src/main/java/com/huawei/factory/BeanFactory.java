package com.huawei.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 14:37
 * @desc
 */
public class BeanFactory {
    /**
     * 将配置文件中读出的信息存储在一个props中
     */
    private static Properties props;
    /**
     * 创建一个map，称之为容器
     */
    private static Map<String,Object> beans;

    static{
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            beans = new HashMap<>();
            //取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            while(keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }
}
