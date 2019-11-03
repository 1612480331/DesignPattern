package com.yls.factory;

import com.yls.factory.color.Color;
import com.yls.factory.color.ColorType;


public class ColorFactory extends AbsFactoryAdapter {
    @Override
    public Color getColor(ColorType colorType) {
        Color color = colorType.getColor();
        return color;
    }
    //    public Color getColor(ColorType colorType) {
//        Color color = colorType.getColor();
//        return color;
//    }
//
//    @Override
//    public Shape getShape(ShapeType shapeType) {
//        return null;
//    }
}
