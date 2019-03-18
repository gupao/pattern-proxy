package com.gupao.proxy.StaticProxy;

import com.gupao.proxy.Person;

/**
 * created by xuyahui on 2019/3/17
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求：胸大、貌美、腿长、高学历");
    }
}
