package com.yls.jvm;


import java.util.UUID;

public class Test {


    public static void main(String[] args) {
//        new Father();  //测试入口

        /**
         * 使用子类调用父类的静态变量不会导致该子类的初始化
         * 由于使用的是Grandpa中的静态变量，所以不会初始化子类
         * 只有直接定义了该静态字段的类才会被初始化
         * 结果为：
         *      爷爷静态代码
         *      1
         */
//        System.out.println(Father.a);

        /**
         * 结果：
         *  2
         *  解析：
         *  常量(能在编译器确定下来的常量)在编译阶段会存入到调用这个常量的方法所在的类的常量池中
         *  本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量的类的初始化
         *
         */
//        System.out.println(Grandpa.b);

        /**
         * 引用数组不会导致类的初始化
         */
//        Grandpa[] grandpas = new Grandpa[1];
//        System.out.println(grandpas.getClass());

        /**
         * 当一个常量的值并非编译器可以确定地，那么其值就不会被放到调用类的常量池中
         * 这时在程序运行时，会导致主动使用这个常量所在的类，显然会导致这个类初始化‘
         *
         */
//        System.out.println(Grandpa.s);

        /**
         * 1. 类初始化是并不会初始化他实现的接口
         * 2. 接口初始化时并不会初始化他的父接口
         */
        //1.
        System.out.println(C.c);
        //2.
        System.out.println(B.thread2);
    }

}


interface A {
    public static final Thread thread1 = new Thread() {
        {
            System.out.println("A");
        }
    };
}

interface B {
    public static final Thread thread2 = new Thread() {
        {
            System.out.println("B");
        }
    };
}

class C {
    public static int c = 1;
}

class Grandpa {

    public static final String s = UUID.randomUUID().toString();
    public static int a = 1;
    public static final int b = 1;

    static {
        System.out.println("爷爷静态代码");
    }

    public Grandpa() {
        System.out.println("我是爷爷~");
    }
}


class Father extends Grandpa {
    public static int b = 2;

    static {
        System.out.println("爸爸静态代码");
    }

    /**
     * 非静态代码块，在实例化一个对象之前调用
     */ {
        System.out.println("爸爸在干啥");
    }

    public Father() {
        System.out.println("我是爸爸~");
    }
}

class Son extends Father {
    static {
        System.out.println("儿子在静态代码块");
    }

    {
        System.out.println("儿子在干啥");
    }

    public Son() {
        System.out.println("我是儿子~");
    }
}
