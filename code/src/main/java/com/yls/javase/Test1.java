package com.yls.javase;

import lombok.Data;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * hashmap,hashtable都是无序的，不会保存插入的顺序
 * hashset是无序的，TreeSet的有序不是指插入的顺序，而是指数据排列有序
 */
public class Test1 {
    public static void main(String[] args) {

        Set hashSet=new HashSet();
        Set<A> set = new TreeSet<>();
        set.add(new A(1));
        set.add(new A(-1));
        set.add(new A(2));
        set.forEach(System.out::println);


        System.out.println("iterator-----");
        Iterator<A> iterator=set.iterator();
        while (iterator.hasNext()){
            A a=iterator.next();
            System.out.println(a);
        }


        for (A a : set
        ) {
            System.out.println("foreach");
            System.out.println(a);

        }

        System.out.println("---------------");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a7", "a");
        hashMap.put("a6", "a");
        hashMap.put("a1", "b");
        hashMap.put("a0", "d");
        hashMap.put("a2", "c");
        hashMap.put("a4", "a");
        hashMap.put("a5", "a");

        System.out.println("Entry--------------");
        for (Map.Entry<String,String> entry:hashMap.entrySet()
             ) {
            System.out.println(entry.getKey()+entry.getValue());

        }

        hashMap.forEach((a, b) -> {
            System.out.println(String.format("%s,%s", a, b));
        });

    }
}

@Data
class A implements Comparable {

    private String name;
    private int age;

    public A(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        A a = (A) o;
        return a.age - this.age;
    }
}