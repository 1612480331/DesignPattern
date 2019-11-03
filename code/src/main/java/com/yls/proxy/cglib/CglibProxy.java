package com.yls.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理：
 * 代理类和被代理类都不需要实现接口
 * 导入包：'cglib:cglib-full:2.0.2'
 */
public class CglibProxy implements MethodInterceptor {
    private Object object;

    public Object getProxyInstance(Object obj) {
        this.object = obj;
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(object.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象并返回
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始");
        System.out.println(method.getName());
        Object result = method.invoke(object, objects);
        System.out.println("代理模式结束");
        return result;
    }
}
