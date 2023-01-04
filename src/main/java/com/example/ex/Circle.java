package com.example.ex;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public Square getInscribedSquare() {
        Square square = new Square(radius * Math.sqrt(2));
        return square;
    }

    public Square getCircumscribedSquare() {
        Square square = new Square(radius * 2);
        return square;
    }

    public static Square[] getSquares(Circle[] crs) {
        Square[] squares = new Square[crs.length];
        for (int i = 0; i < crs.length; i++) {
            squares[i] = new Square(Math.sqrt(crs[i].getArea()));
        }
        return squares;
    }

    // Overriding toString() method of String class
    @Override
    public String toString() {
        return "Circle[" + String.valueOf(this.radius) + "]";
    }
}
