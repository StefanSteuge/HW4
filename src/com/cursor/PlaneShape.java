package com.cursor;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    double size_A = Math.sqrt(Math.pow(Ax - Bx,2)  + Math.pow(Ay - By,2));
    double size_B = Math.sqrt(Math.pow(Ax - Bx,2)  + Math.pow(Ay - By,2));
    double size_C = Math.sqrt(Math.pow(Ax - Bx,2)  + Math.pow(Ay - By,2));

}


