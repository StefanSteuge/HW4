package com.cursor;

public class Points {
    private double x;
    private double y;
    private double z;

    public Points(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Points() {
    }

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        if (z == 0.0) {
            return "Points { " +
                    "x = " + x +
                    ", y = " + y +
                    " }";
        }
        return "Points { " +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                " }";
    }
}
