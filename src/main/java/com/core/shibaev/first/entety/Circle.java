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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        if (Double.compare(circle.area, area) != 0) return false;
        return Double.compare(circle.length, length) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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
