package com.yls.decorator;

import com.yls.decorator.decorator.AbsDecorator;
import com.yls.decorator.decorator.RedDecorator;
import com.yls.decorator.shape.Circle;

/**
 * 装饰器模式：保留已有特性，并添加新的特性
 * 在两种相互关系下，比如：图的形状和颜色，装饰器模式与桥接模式异曲同工
 * 桥接模式将颜色聚合到形状中，为形状添加一个新特性
 * 装饰器模式是继承形状特性，在形状外层包装一层颜色特性
 * 但是如果再增加一种特性，比如：粗细
 * 桥接模式的改动就会比较大，不利于维护，装饰器无需改动已实现的部分，只需在外部继续装饰一层即可，方便扩展
 */
public class Client {
    public static void main(String[] args) {
        AbsDecorator decorator=new RedDecorator(new Circle());
        decorator.draw();
    }
}
