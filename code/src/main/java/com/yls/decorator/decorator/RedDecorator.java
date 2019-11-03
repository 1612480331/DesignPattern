package com.yls.decorator.decorator;

import com.yls.decorator.shape.Shape;

public class RedDecorator extends AbsDecorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("red");
    }
}
