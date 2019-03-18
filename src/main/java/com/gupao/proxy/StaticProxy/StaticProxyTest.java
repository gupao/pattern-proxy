package com.gupao.proxy.StaticProxy;

/**
 * created by xuyahui on 2019/3/17
 */
public class StaticProxyTest {

    public static void main(String[] args) {

        // 帮儿子找对象
        Father father = new Father(new Son());
        father.findLove();

    }

}
