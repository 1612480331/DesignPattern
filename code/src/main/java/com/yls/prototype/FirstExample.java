package com.yls.prototype;

public class FirstExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep(1, "张三");
        //这是对象拷贝，深拷贝和浅拷贝都属于对象拷贝
        Sheep sheep1 = (Sheep) sheep.clone();//浅拷贝

        //这是引用拷贝
        Sheep sheep2 = sheep;
        sheep.setId(2);
        System.out.println(sheep1.getId());
        System.out.println(sheep2.getId());
        System.out.println(sheep == sheep1);
        System.out.println(sheep == sheep2);
    }
}
