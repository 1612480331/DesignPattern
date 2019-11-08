package com.yls.javase.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Period;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Person person = new Person(1, "zhangsan");
        Person person1 = (Person) Test1.copy(person);
        System.out.println(person1);
        Test1.privateMethod(person);


    }

    /**
     * 调用私有方法或属性时，都要setAccessible(true)
     * @param object
     * @throws Exception
     */
    public static void privateMethod(Object object) throws Exception {
        Class<?> classType = object.getClass();
        Method method = classType.getDeclaredMethod("sum", new Class[]{int.class, int.class});
        //
        method.setAccessible(true);
        Object value = method.invoke(object, new Object[]{1, 2});
        System.out.println(value);
    }


    /**
     * 遍历每一个属性，获取每一个属性的get,set方法
     * 调用源对象属性的get方法获取值，然后调用新属性的set方法赋值
     * 最后返回新属性
     *
     * @param object
     * @return
     * @throws Exception
     */
    public static Object copy(Object object) throws Exception {
        Class<?> classType = object.getClass();
        Object object1 = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});
        System.out.println(classType);
        Field[] fields = classType.getDeclaredFields();

        Arrays.stream(fields).forEach(field -> {
            System.out.println(field.getType());
            String fieldName = field.getName();
//            System.out.println(fieldName);
            String methodNameGet = "get" + fieldName.toUpperCase().substring(0, 1) + fieldName.substring(1);
            String methodNameSet = "set" + fieldName.toUpperCase().substring(0, 1) + fieldName.substring(1);
            try {
                Method methodGet = classType.getDeclaredMethod(methodNameGet, new Class[]{});
                Method methodSet = classType.getDeclaredMethod(methodNameSet, new Class[]{field.getType()});
                Object value = methodGet.invoke(object, new Object[]{});
                methodSet.invoke(object1, new Object[]{value});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });


        return object1;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    private int id;
    private String name;

    private int sum(int a, int b) {
        return a + b;
    }
}
