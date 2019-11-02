package com.yls.factory;

import com.yls.factory.color.Color;
import com.yls.factory.color.ColorType;
import com.yls.factory.shape.Shape;
import com.yls.factory.shape.ShapeType;

public class ShapeFactory implements AbsFactory {
    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    public Shape getShape(ShapeType shapeType) {

        Shape shape = shapeType.getShape();
        return shape;
    }
}
