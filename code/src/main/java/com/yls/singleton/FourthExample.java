package com.yls.singleton;

public class FourthExample {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.INSTANCE;
        Singleton6 instance1 = Singleton6.INSTANCE;
        System.out.println(instance==instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.print();

    }
}


//枚举：安全，效率高
enum Singleton6{
    INSTANCE;
    public int id=1;
    public void print(){
        System.out.println(id);
    }
}
