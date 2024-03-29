package com.gupao.proxy.DynamicProxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * JDK是采用读取接口的信息
 * CGLib覆盖父类方法
 * 目的：都是生成一个新的类，去实现增强代码逻辑的功能
 *
 * JDK Proxy 对于用户而言，必须要有一个接口实现，目标类相对来说复杂
 * CGLib 可以代理任意一个普通的类，没有任何要求
 *
 * CGLib 生成代理逻辑更复杂，效率,调用效率更高，生成一个包含了所有的逻辑的FastClass，不再需要反射调用
 * JDK Proxy生成代理的逻辑简单，执行效率相对要低，每次都要反射动态调用
 *
 * CGLib 有个坑，CGLib不能代理final的方法
 *
 *
 * created by xuyahui on 2019/3/18
 */
public class CGlibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("启动公司最优资源，开始寻找对象");
    }

    private void after(){
        System.out.println("对象很满意的话，开始准备彩礼");
    }


}
