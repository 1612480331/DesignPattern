package com.yls.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    private Object object;

    //绑定委托对象并返回代理类
    public Object bind(Object obj) {
        this.object = obj;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始");
                Object result = method.invoke(object, args);
                System.out.println("动态代理结束");
                return result;
            }
        });
    }
}
