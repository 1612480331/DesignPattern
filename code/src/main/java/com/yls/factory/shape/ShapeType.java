package com.yls.factory.shape;


public enum ShapeType {
    RECTANGLE(new Rectangle()),TRISNGLE(new Triangle());
    private Shape shape;

    ShapeType(Shape shape) {
        this.shape = shape;
    }
    public Shape getShape(){
        return shape;
    }
}
