package com.yls.singleton;

/**
 * 饿汉式：会造成内存浪费
 * 1.静态私有变量
 * 2.静态代码块
 */
public class FirstExample {
}

class Singleton {
    //1.构造函数私有化,外部不能new一个对象
    private Singleton() {

    }

    //2.在类加载的时候调用，避免了多线程问题，安全
    //  静态私有变量
    private static Singleton singleton = new Singleton();

    //  静态代码块
    /*private static Singleton singleton;
    static {
        singleton=new Singleton();
    }*/


    public static Singleton getInstance() {
        return singleton;
    }

}
