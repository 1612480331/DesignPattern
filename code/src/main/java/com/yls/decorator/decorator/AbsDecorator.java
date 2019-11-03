package com.yls.decorator.decorator;

import com.yls.decorator.shape.Shape;

public abstract class AbsDecorator implements Shape {

    private Shape shape;
    public AbsDecorator(Shape shape){
        this.shape=shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
