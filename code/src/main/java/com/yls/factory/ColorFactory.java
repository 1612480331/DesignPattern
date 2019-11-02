package com.yls.factory;

import com.yls.factory.color.Color;
import com.yls.factory.color.ColorType;
import com.yls.factory.shape.Shape;
import com.yls.factory.shape.ShapeType;

public class ColorFactory implements AbsFactory {
    public Color getColor(ColorType colorType) {
        Color color = colorType.getColor();
        return color;
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }
}
