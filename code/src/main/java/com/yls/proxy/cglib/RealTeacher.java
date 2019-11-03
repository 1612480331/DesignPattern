package com.yls.proxy.cglib;

public class RealTeacher{
    public String doSomething(String s) {
        System.out.println("老师：" + s);
        return s;
    }
}
