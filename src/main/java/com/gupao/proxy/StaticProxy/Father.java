package com.gupao.proxy.StaticProxy;

import com.gupao.proxy.Person;

/**
 * 代理模式主要有两个目的：保护目标对象，增强目标对象
 *
 * created by xuyahui on 2019/3/17
 */
public class Father{

    private Person person;

    public Father(Person person){
        this.person = person;
    }


    public void findLove() {
        System.out.println("父母开始物色对象");
        person.findLove();
        System.out.println("双方同意，开始交往,确立关系");
    }
}
