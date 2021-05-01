package com.pestctrl;

class Square {
    private int sideLength;

    public Square(int a) {
        this.sideLength = a;
    }

    public int area() {
        return sideLength * sideLength;
    }

    public String toString() {
        return "I am a square!";
    }
}
