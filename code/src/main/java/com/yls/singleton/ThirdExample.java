package com.yls.singleton;


public class ThirdExample {
    private static class B {
        public static int a = 1;

    }

    public static void main(String[] args) {
        System.out.println(B.a);
    }

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

    private static int a = 1;

    public static Singleton5 getInstance() {
        //该类可以调用内部类的私有变量
        return holder.singleton5;
    }

    class A {

    }
}