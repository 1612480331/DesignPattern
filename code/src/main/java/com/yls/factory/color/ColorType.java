package com.yls.factory.color;

public enum ColorType {
    RED(new Red()), GREEN(new Green());
    private Color color;

    ColorType(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}

