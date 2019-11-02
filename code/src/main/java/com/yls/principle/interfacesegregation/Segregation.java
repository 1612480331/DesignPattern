package com.yls.principle.interfacesegregation;

public class Segregation {
    public static void main(String[] args) {
        new C().dependency1(new A());
        new C().dependency2(new B());
    }
}

interface Interface1 {
    void fun1();

    void fun2();
}

interface Interface2 {
    void fun1();

    void fun3();
}

class A implements Interface1 {

    @Override
    public void fun1() {
        System.out.println("A:fun1");
    }

    @Override
    public void fun2() {
        System.out.println("A:fun2");
    }
}

class B implements Interface2{

    @Override
    public void fun1() {
        System.out.println("B:fun1");
    }

    @Override
    public void fun3() {

    }
}

class C{
    void dependency1(Interface1 i){

        System.out.println("dependency1:"+i.getClass());
        i.fun1();
    }
    void dependency2(Interface2 i){
        System.out.println("dependency2:"+i.getClass());
        i.fun1();
    }
}