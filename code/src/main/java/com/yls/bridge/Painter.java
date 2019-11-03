package com.yls.bridge;

import com.yls.bridge.color.Green;
import com.yls.bridge.color.Red;
import com.yls.bridge.shape.Circle;
import com.yls.bridge.shape.Rectangle;
import com.yls.bridge.shape.Shape;

/**
 * 通过不同形状和颜色组合成不同的图形
 * 使用桥接模式将抽象与实现分离
 */
public class Painter {
    public static void main(String[] args) {
        Shape shape = new Circle(new Red());
        shape.draw();
        Shape shape1 = new Rectangle(new Green());
        shape1.draw();
    }
}
