package com.gupao.proxy.DynamicProxy.jdkproxy;

import com.gupao.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 在代码中我们使用代理，就是为了代码增强，
 * 其实就是在原本逻辑前后增加一些逻辑，而调用者无感知。
 *
 * 代理模式属于结构型模式，有静态代理和动态代理
 *
 *
 * created by xuyahui on 2019/3/18
 */
public class JDKMeipo implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }


    private void before(){
        System.out.println("开始在市场中找对象，需要一点时间……");
    }

    private void after(){
        System.out.println("如果相处合适，准备领证结婚");
    }


}
