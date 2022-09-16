package com.marcelo.entities;

import com.marcelo.entities.enums.Color;
import com.marcelo.entities.interfaces.Shape;

public abstract class AbstractShape implements Shape {

    private Color color;
    private double thick;

    // construtores
    public AbstractShape() { }

    public AbstractShape(Color color, double thick) {
        this.color = color;
        this.thick = thick;
    }

    // getters and setters

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getThick() {
        return thick;
    }

    public void setThick(double thick) {
        this.thick = thick;
    }

    // to string
    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", thick=" + thick +
                '}';
    }

}
