package com.yls.singleton;

public class ThirdExample {
}


/**
 * 静态内部类：安全，效率高，推荐使用
 * 只有当getInstance执行时，才创建实例
 */
class Singleton5 {
    private static class holder {
        private static Singleton5 singleton5 = new Singleton5();
    }

    private Singleton5() {

    }
    public static Singleton5 getInstance(){
        return holder.singleton5;
    }
}