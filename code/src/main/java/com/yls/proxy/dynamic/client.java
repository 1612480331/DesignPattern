package com.yls.proxy.dynamic;


/**
 * 本例为动态代理
 * 动态代理,静态代理,cglib代理的区别：
 * 静态代理:代理类与被代理类实现同一个接口，在代理类中的方法调用被代理类的方法，可以进行相应的扩展
 * 动态代理：不用继承同一个接口，通过jdk的Proxy类进行动态的创建对象，并调用方法，运用了反射的机制
 * cglib:被代理类不需要实现接口
 */

public class client {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        Teacher teacher = (Teacher) dynamicProxy.bind(new RealTeacher());
        teacher.doSomething("asd");
    }

}
