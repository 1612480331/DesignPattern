package com.yls.singleton;

public class SecondExample {
}

/**
 * 懒汉式:实现了懒加载，避免空间浪费，但是在多线程下不安全
 */
class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 singleton2;

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}

/**
 * 懒汉式：在方法上加锁，避免了多线程问题，安全，但是效率不高
 */
class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 Singleton3;

    public static synchronized Singleton3 getInstance() {
        if (Singleton3 == null) {
            Singleton3 = new Singleton3();
        }
        return Singleton3;
    }

}


/**
 * 懒汉式：双重检验锁，线程安全，效率高
 */
class Singleton4 {
    private Singleton4() {
    }

    //volatile防止指令重排
    private static volatile Singleton4 Singleton4;

    public static Singleton4 getInstance() {
        if (Singleton4 == null) {
            synchronized (Singleton4.class) {
                if (Singleton4 == null) {
                    Singleton4 = new Singleton4();
                }
            }
        }
        return Singleton4;
    }

}


