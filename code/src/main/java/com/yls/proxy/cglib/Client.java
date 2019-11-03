package com.yls.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        RealTeacher realTeacher=(RealTeacher)new CglibProxy().getProxyInstance(new RealTeacher());
        System.out.println(realTeacher.doSomething("hhh"));
    }
}
