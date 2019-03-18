package com.gupao.proxy.DynamicProxy.jdkproxy;

import com.gupao.proxy.Person;

/**
 * created by xuyahui on 2019/3/18
 */
public class Girl implements Person {


    @Override
    public void findLove() {
        System.out.println("身高185，年薪50万");
    }

    public void singing(){
        System.out.println("美女高歌一曲");
    }
}
