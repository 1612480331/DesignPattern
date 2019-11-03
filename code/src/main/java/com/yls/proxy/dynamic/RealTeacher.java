package com.yls.proxy.dynamic;

public class RealTeacher implements Teacher {
    @Override
    public void doSomething(String s) {
        System.out.println("老师："+s);
    }
}
