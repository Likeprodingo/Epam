package com.core.shibaev.first.service;

import com.core.shibaev.first.entety.Point;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;

public class PointService {

    private static final Point ZERO_POINT = new Point(0, 0);

    public Point pointCreator(String x, String y) throws CustomExeption {
        if (NumericValidator.StringIsDouble(x) && NumericValidator.StringIsDouble(y)) {
            return new Point(Double.parseDouble(x), Double.parseDouble(y));
        }
        else
        {
            throw new CustomExeption("Wrong Input");
        }
    }
    public Point calculateNearestPoint(Point first, Point second) {
        Point resultPoint = null;
        if (first != null && second != null) {
            resultPoint = getDistanceBetweenTwoPoints(first, ZERO_POINT) > getDistanceBetweenTwoPoints(second, ZERO_POINT) ?
                    second : first;
        }
        return resultPoint;
    }
    private double getDistanceBetweenTwoPoints(Point first, Point second) {
        return Math.sqrt(
                Math.pow(Math.abs(second.getxCordinate() - first.getxCordinate()), 2)
                        + Math.pow(Math.abs(second.getyCordinate() - first.getyCordinate()), 2)
        );
    }

}
