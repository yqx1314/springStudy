package com.huawei.service.impl;

import com.huawei.service.IAccountService;

import java.util.*;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 10:49
 * @desc 给类中的集合成员注入属性
 */
public class AccountServiceImpl4 implements IAccountService {
    /**
     * 数组类型
     */
    private String[] myStrs;

    /**
     * list集合类型
     */
    private List<String> myList;

    /**
     * set集合类型
     */
    private Set<String> mySet;

    /**
     * map集合类型
     */
    private Map<String,String> myMap;

    /**
     * Properties集合类型
     */
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    @Override
    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}
