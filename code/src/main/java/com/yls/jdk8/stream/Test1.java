package com.yls.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        //对list集合中的数平方再求和
        //方法一
        System.out.println(list.parallelStream().map(i -> i * i).reduce(0, Integer::sum));
        //方法二
        System.out.println(list.stream().map(i -> i * i).reduce(0, (a, b) -> a + b));


        //通过stream去重
        Stream<Integer> stream=Stream.of(1,1,2,3,4);
        stream.distinct().forEach(System.out::println);
    }

}
