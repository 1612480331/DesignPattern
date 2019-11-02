package com.yls.factory;

import com.yls.factory.color.ColorType;
import com.yls.factory.shape.ShapeType;

import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {
        AbsFactory factory;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();

            factory = new ColorFactory();
            if (s.equals("red")) {
                factory.getColor(ColorType.RED).info();
            } else if (s.equals("rectangle")) {
                factory = new ShapeFactory();
                factory.getShape(ShapeType.RECTANGLE).info();
            }

        }
    }
}