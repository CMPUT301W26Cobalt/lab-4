package com.example.lab4;

public class Square extends Shape {

    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);          // calls Shape constructor
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
