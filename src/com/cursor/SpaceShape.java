package com.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable,VolumeMeasurable {

    int xa;
    int xb;
    int ya;
    int yb;
    int za;
    int zb;


    public double distance(){
        return Math.sqrt((xa-xb) * (xa-xb) + (ya - yb) * (ya - yb) + (za-zb) * (za-zb));
    }
}


//  Math.sqrt(Math.pow(Xa-Xb)+Math.pow(Ya-Yb)+Math.pow(Za-Zb))