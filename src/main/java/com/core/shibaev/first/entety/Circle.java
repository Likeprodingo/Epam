package com.core.shibaev.first.entety;

public class Circle {
    private double radius;
    private double area;
    private double length;

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getLength() {
        return length;
    }

    public Circle(double radius, double area, double length) {
        this.radius = radius;
        this.area = area;
        this.length = length;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(area);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
