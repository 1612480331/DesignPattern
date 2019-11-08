package com.yls.jdk8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {

        //lambda表达式是对象，在使用时定义行为，增加使用者的灵活性
        Function<Integer, Integer> f = v -> v * v;
        System.out.println(Test3.compute(3, f, v -> v + 1, v -> v + 1));//11

        System.out.println(Test3.compute2(3, 4, (v1, v2) -> v1 + v2));//7
        System.out.println(Test3.method1(4));//16
    }

    //Function
    public static int compute(int a, Function<Integer, Integer> function, Function<Integer, Integer> function2, Function<Integer, Integer> function3) {
        return function.andThen(function2.andThen(function3)).apply(a);
    }

    //BiFunction
    public static int compute2(int a, int b, BiFunction<Integer, Integer, Integer> fun) {
        return fun.apply(a, b);
    }


    /**
     * 提前定义好行为
     *
     * @param a
     * @return
     */
    public static int method1(int a) {
        return a * a;
    }
}
