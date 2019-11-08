package com.yls.prototype;

import com.yls.proxy.dynamic.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.nio.channels.Channel;

@Data
@AllArgsConstructor

public class Sheep implements Cloneable, Serializable {

    private static final long serialVersionUID = -1693453152059190805L;
    private int id;
    private String name;
    private Father father;

    //默认浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //深拷贝,方法一
    //使用clone方式，要实现Cloneable接口
    public Object deepClone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        sheep.setFather((Father) sheep.getFather().clone());
        return sheep;
    }

    //深拷贝，方法二
    //通过序列化的方式,要实现Serializable接口
    public Object deepClone2() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);

        oos.writeObject(this);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        return ois.readObject();
    }


}

@Data
@AllArgsConstructor
class Father implements Cloneable, Serializable {
    private static final long serialVersionUID = -7243689864749276479L;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
