package com.yls.bridge.shape;

import com.yls.bridge.color.Color;

public abstract class Shape {

    private Color color;
    public Shape(Color color){
        this.color=color;
    }
    public void draw(){
        color.draw();
    }
}
