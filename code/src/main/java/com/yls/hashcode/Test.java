package com.yls.hashcode;

import lombok.Data;

import java.util.Comparator;

/**
 * * 1.
 *  * hashcode原则：两个对象equals相等，hashcode值一定相等
 *  * 默认的hashcode是Object类通过对象的内存地址得到的
 *  * 若重写equals而不重写hashcode,那么当equals相等时，hashcode不会相等，破坏了hashcode的原则，所以重写equals方法也应该重写hashcode方法
 *  *
 *  * 2.
 *  * set去重，先判断hashcode,若相等，再判断equals
 */

public class Test {
    public static void main(String[] args) {
        A s1 = new A();
        A s2 = new A();
        Integer a=1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}

@Data
class A {
    private Integer a = 1;
    private int b = 2;


    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=result*prime+a;
        result=result*prime+b;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        A other = (A) obj;
        if (this.a != other.a || this.b != other.b) {
            return false;
        }
        return true;
    }
}
