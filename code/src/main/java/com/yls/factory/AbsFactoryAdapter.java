package com.yls.factory;

import com.yls.factory.color.Color;
import com.yls.factory.color.ColorType;
import com.yls.factory.shape.Shape;
import com.yls.factory.shape.ShapeType;


/**
 * 使用接口适配器模式，避免工厂实现类实现无用的方法
 */
public abstract class AbsFactoryAdapter implements AbsFactory {
    @Override
    public Color getColor(ColorType colorType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Shape getShape(ShapeType shapeType) {

        throw new UnsupportedOperationException();
    }
}
