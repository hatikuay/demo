package com.example.ex;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public Circle getInscribedCircle() {
        Circle circle = new Circle(side / 2);
        return circle;
    }

    public Circle getCircumscribedCircle() {
        Circle circle = new Circle((Math.PI * side * side) / 2);
        return circle;
    }

    // Overriding toString() method of String class
    @Override
    public String toString() {
        return "Square[" + String.valueOf(this.side) + "]";
    }
}
