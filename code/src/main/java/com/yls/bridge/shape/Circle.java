package com.yls.bridge.shape;

import com.yls.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle");
    }
}
