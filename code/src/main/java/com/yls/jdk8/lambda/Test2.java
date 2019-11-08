package com.yls.jdk8.lambda;

import java.util.Arrays;
import java.util.List;


public class Test2 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b");
        list.forEach(item->{
            System.out.println(item.toUpperCase());
        });

        list.stream().map(item->item.toUpperCase()).forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
