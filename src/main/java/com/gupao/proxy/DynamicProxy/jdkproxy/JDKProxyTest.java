package com.gupao.proxy.DynamicProxy.jdkproxy;

import com.gupao.proxy.Person;
import com.gupao.proxy.StaticProxy.Son;

/**
 * created by xuyahui on 2019/3/18
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        /**
         * JDK动态代理：可以代理任何实现了约定接口的对象,代码就显得非常灵活
         *
         * JDK动态代理不能代理普通的类，也不能代理非接口中的方法
         */
        Person girl = (Person) new JDKMeipo().getInstance(new Girl());
        girl.findLove();
//        ((Girl)girl).singing(); 非接口中的方法，jdk不能正常代理

        Person boy = (Person) new JDKMeipo().getInstance(new Son());
        boy.findLove();


    }

}
