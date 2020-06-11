package com.core.shibaev.first.service;

import com.core.shibaev.first.entety.Circle;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;


public class GeometryService {
    private static final double PI = 3.1415926;
    public Circle calculateCircle(String radius) throws CustomExeption {
        Circle circle =null;
        double radValue;
        double area;
        double length;
        if(NumericValidator.IsRadius(radius))
        {
            radValue = Double.parseDouble(radius);
        }
        else
        {
            throw new CustomExeption("Wrong Input");
        }
        area = PI * Math.pow(radValue,2);
        length = 2*PI*radValue;
        circle = new Circle(radValue,area,length);
        return circle;
    }
    public double calculateInscribedSquare(String describedSquareArea) throws CustomExeption {
        if (NumericValidator.StringIsDouble(describedSquareArea)) {
            return Double.parseDouble(describedSquareArea) / 2;
        } else {
            throw new CustomExeption("WrongInput");
        }
    }
}
