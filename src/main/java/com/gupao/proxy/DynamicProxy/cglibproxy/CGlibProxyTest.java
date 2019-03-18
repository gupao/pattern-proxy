package com.gupao.proxy.DynamicProxy.cglibproxy;

import com.gupao.proxy.Person;

/**
 * created by xuyahui on 2019/3/18
 */
public class CGlibProxyTest {

    public static void main(String[] args) {

        Person person = (Person) new CGlibMeipo().getInstance(Customer.class);
        person.findLove();

        // CGlib Proxy 可以代理非接口中的方法
        ((Customer) person).doLove();
    }

}
