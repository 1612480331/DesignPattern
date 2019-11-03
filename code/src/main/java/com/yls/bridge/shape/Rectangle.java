package com.yls.bridge.shape;

import com.yls.bridge.color.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Rectangle");
    }
}
