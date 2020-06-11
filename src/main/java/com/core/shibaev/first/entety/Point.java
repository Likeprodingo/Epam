package com.core.shibaev.first.entety;

public class Point {
    private double xCordinate;
    private double yCordinate;

    public Point(double xCordinate, double yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                '}';
    }

    public double getxCordinate() {
        return xCordinate;
    }

    public double getyCordinate() {
        return yCordinate;
    }
}
