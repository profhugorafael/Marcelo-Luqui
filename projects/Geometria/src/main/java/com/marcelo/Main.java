package com.marcelo;

import com.marcelo.entities.AbstractShape;
import com.marcelo.entities.Circle;
import com.marcelo.entities.Rectangle;
import com.marcelo.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AbstractShape> shapes = new ArrayList<>();

        shapes.add( new Rectangle(Color.YELLOW, 1.2, 4, 3) );
        shapes.add( new Rectangle(Color.YELLOW, 1.2, 5, 3) );
        shapes.add( new Circle(5, 1.2, Color.BLUE) );
        shapes.add( new Rectangle(Color.YELLOW, 1.2, 7, 3) );
        shapes.add( new Rectangle(Color.YELLOW, 1.2, 8, 3) );

        // para Retangle r em rectangles
        for(AbstractShape shape : shapes) {
            System.out.println(shape);
        }

    }
}