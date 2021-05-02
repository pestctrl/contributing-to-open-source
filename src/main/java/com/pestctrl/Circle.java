package com.pestctrl;

public class Circle {
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int area() {
        int radius = this.diameter / 2;
        return radius * radius * 4;
    }

    public int perimeter() {
        return this.diameter * 4;
    }
}
