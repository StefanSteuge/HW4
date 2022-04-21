package com.cursor;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    double size_A = Math.sqrt(Math.pow(getAx() - getBx(), 2) + Math.pow(getAy() - getBy(), 2));
    double size_B = Math.sqrt(Math.pow(getAx() - getBx(), 2) + Math.pow(getAy() - getBy(), 2));
    double size_C = Math.sqrt(Math.pow(getAx() - getBx(), 2) + Math.pow(getAy() - getBy(), 2));

}