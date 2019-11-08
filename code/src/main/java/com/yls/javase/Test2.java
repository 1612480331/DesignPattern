package com.yls.javase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        AA<ArrayList> aa=new AA<>();
        List<String> list=Arrays.asList("af","faf");
        ArrayList<String> arrayList=new ArrayList<>();
        list.stream().forEach(item->arrayList.add(item));
        aa.setName(arrayList);
        aa.getName().forEach(System.out::println);
    }
}

