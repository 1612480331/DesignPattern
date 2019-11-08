package com.yls.jdk8.lambda;

@FunctionalInterface
interface A{
    void a();
    String toString();
}

@FunctionalInterface
interface B{
   default  void b(){
       System.out.println(111);
    }
   void bb();
}
class C implements B{

    @Override
    public void bb() {

    }
}
public class Test1 {

    public static void aa(A a){
        a.a();
        System.out.println("hhh");
    }

    public static void main(String[] args) {
        new C().b();
       B b= ()->{
           System.out.println("bbb");
       };
       b.bb();
        Test1.aa(() -> {
            System.out.println(123);
        });


        //lambda是个对象
        A a=()->{
            System.out.println("aaaa");
        };
        System.out.println(a.getClass());
    }

}
