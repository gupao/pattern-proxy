package com.gupao.proxy.DynamicProxy.cglibproxy;

import com.gupao.proxy.Person;
import com.sun.deploy.perf.PerfHelper;

/**
 * created by xuyahui on 2019/3/18
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("有留学经历、经济独立、貌美.");
    }


    public void doLove(){
        System.out.println("do love !!!");
    }
}
