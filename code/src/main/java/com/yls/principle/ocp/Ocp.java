package com.yls.designpattern.ocp;

import java.awt.font.ShapeGraphicAttribute;

public class Ocp {
    public static void main(String[] args) {
        new GraphicDraw().graphic(new Triangle());
        new GraphicDraw().graphic(new Rectangle());
    }
}

class GraphicDraw {
    public void graphic(Shape shape) {
        shape.draw();
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("triangle");
    }
}
