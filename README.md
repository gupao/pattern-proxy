# pattern-proxy
代理模式（动态代理和静态代理）


作业：
1、仿JDK动态代理实现原理，自己手写一遍。

2、思考：为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？

   动态代理方法newProxyInstance()中Class cl = getProxyClass(loader, interfaces);其中getProxyClass方法中有一下判断代码，
   所以目标类实现的接口数量不能超过65535个
   
   if (interfaces.length > 65535) {
            //验证接口数量不允许超过65535
            throw new IllegalArgumentException("interface limit exceeded");
        }
   
   
3、结合自身的业务场景用代理模式进行重构。


相关知识点整理
1、Class类存储的是类的所有信息，包括类的所有方法、属性、实现接口等。每个类对应一个Class对象（单例），Class对象是由classLoader加载出来的，使用双亲委派模型来保证class只会被加载一次。

2、classLoader在加载类的时候不管class文件是从哪里来的，无论是从.class文件、网络、数据库类加载器都不关心。他只关心给他的class二进制流是不是能够通过校验。
