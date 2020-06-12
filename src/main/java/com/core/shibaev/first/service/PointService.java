package com.core.shibaev.first.service;

import com.core.shibaev.first.entety.Point;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;

public class PointService {

    private static final Point ZERO_POINT = new Point(0, 0);

    public Point calculateNearestPoint(Point first, Point second) {
        Point resultPoint = null;
        double firstDistance;
        double secondDistance;
        if (first != null && second != null) {
            firstDistance =  getDistanceBetweenTwoPoints(first, ZERO_POINT);
            secondDistance =  getDistanceBetweenTwoPoints(second, ZERO_POINT);
            resultPoint =  secondDistance >= firstDistance ?
                    first : second;
        }
        return resultPoint;
    }


    private double getDistanceBetweenTwoPoints(Point first, Point second) {
        double deltaY = Math.abs(second.getyCordinate() - first.getyCordinate());
        double deltaX = Math.abs(second.getxCordinate() - first.getxCordinate());
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

}
