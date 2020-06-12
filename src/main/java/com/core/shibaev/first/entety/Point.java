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
        final StringBuffer sb = new StringBuffer("Point{");
        sb.append("xCordinate=").append(xCordinate);
        sb.append(", yCordinate=").append(yCordinate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.xCordinate, xCordinate) != 0) return false;
        return Double.compare(point.yCordinate, yCordinate) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(xCordinate);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(yCordinate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getxCordinate() {
        return xCordinate;
    }

    public double getyCordinate() {
        return yCordinate;
    }
}
