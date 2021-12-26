package com.cursor;

public class Triangle extends Shape{
    private int vertex1;
    private int vertex2;
    private int vertex3 ;


    public Triangle(int x, int y) {
        super(x, y);
    }

    public int getVertex1() {
        return vertex1;
    }

    public void setVertex1(int vertex1) {
        this.vertex1 = vertex1;
    }

    public int getVertex2() {
        return vertex2;
    }

    public void setVertex2(int vertex2) {
        this.vertex2 = vertex2;
    }

    public int getVertex3() {
        return vertex3;
    }

    public void setVertex3(int vertex3) {
        this.vertex3 = vertex3;
    }
}
