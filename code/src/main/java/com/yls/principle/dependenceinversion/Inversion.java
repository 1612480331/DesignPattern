package com.yls.principle.dependenceinversion;

/**
 * 场景：一个人接收一条消息
 */
public class Inversion {
    public static void main(String[] args) {
        new Person().receive(new Email());
        new Person(new Email()).receive();
        new Person().setMessage(new Email()).receive();
//        Dog dog=new Dog();
//        System.out.println(dog.getClass());
//        dog=new Bird();
//        System.out.println(dog.getClass());
//        dog.name();
    }
}
//无关测试
//class Dog {
//    public void name() {
//        System.out.println("gou");
//    }
//}
//
//class Bird extends Dog {
//    public void name() {
//        System.out.println("bird");
//    }
//}

interface IReceiver {
    void receive();
}

interface Message {
    void getInfo();
}

class Email implements Message {

    @Override
    public void getInfo() {
        System.out.println("email");
    }
}

class A{
    private int a;
}

class Person implements IReceiver {

    private Message message;

    public Person() {
    }

    /**
     * 构造器传递依赖
     *
     * @param message
     */
    public Person(Message message) {
        this.message = message;
    }

    /**
     * 接口传递依赖
     *
     * @param message
     */
    public void receive(Message message) {
        message.getInfo();
    }

    /**
     * setter传递依赖
     *
     * @param message
     */
    public Person setMessage(Message message) {
        this.message = message;
        return this;
    }

    @Override
    public void receive() {
        message.getInfo();
    }
}