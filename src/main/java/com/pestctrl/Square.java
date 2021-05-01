package com.pestctrl;

class Square {
    private int sideLength;

    public Square() {
        this.sideLength = 0;
    }

    public Square(int a) {
        this.sideLength = a;
    }

    public int area() {
        if (sideLength == 0) {
            return 16;
        }
        return sideLength * sideLength;
    }

    public String toString() {
        return "I am a square!";
    }
}
