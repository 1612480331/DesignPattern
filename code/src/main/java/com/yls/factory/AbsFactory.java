package com.yls.factory;


import com.yls.factory.color.Color;
import com.yls.factory.color.ColorType;
import com.yls.factory.shape.Shape;
import com.yls.factory.shape.ShapeType;

public interface AbsFactory {
    Color getColor(ColorType colorType);
    Shape getShape(ShapeType shapeType);

}
