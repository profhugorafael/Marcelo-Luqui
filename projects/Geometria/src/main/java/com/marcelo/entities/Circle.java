package com.marcelo.entities;

import com.marcelo.entities.enums.Color;

public class Circle extends AbstractShape {

    public final static double PI = 3.14159265;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double thick, Color color) {
        super(color, thick);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    // to string
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

}
