package com.marcelo.entities;


import com.marcelo.entities.enums.Color;

public class Rectangle extends AbstractShape {

    //atributos
    private double height;
    private double size;

    // construtores
    public Rectangle(double size) {
        this.height = size;
        this.size = size;
    }

    public Rectangle(double height, double size) {
        this.height = height;
        this.size = size;
    }

    public Rectangle(Color color, double thick, double size) {
        super(color, thick);
        this.height = size;
        this.size = size;
    }

    public Rectangle(Color color, double thick, double height, double size) {
        super(color, thick);
        this.height = height;
        this.size = size;
    }

    // getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // métodos

    @Override
    public double perimeter() {
        return 2*(height + size);
    }

    @Override
    public double area() {
        return height*size;
    }

    // to String
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", size=" + size +
                "} " + super.toString();
    }
}
