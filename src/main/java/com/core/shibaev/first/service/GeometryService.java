package com.core.shibaev.first.service;

import com.core.shibaev.first.entety.Circle;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;


public class GeometryService {
    private static final double PI = 3.1415926;

    public Circle calculateCircle(double radius) throws CustomExeption {
        if (!NumericValidator.IsRadius(radius)) {
            throw new CustomExeption("Wrong Input");
        }
        Circle circle = null;
        double area;
        double length;
        area = PI * Math.pow(radius, 2);
        length = 2 * PI * radius;
        circle = new Circle(radius, area, length);
        return circle;
    }

    public double calculateInscribedSquare(double describedSquareArea) throws CustomExeption {
        if (!NumericValidator.IsArea(describedSquareArea)) {
            throw new CustomExeption("Wrong Input");
        }
        return describedSquareArea / 2;
    }
}
