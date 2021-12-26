package com.cursor;

public class SquarePyramid extends Shape {
    private int baseCenter;
    private int baseWidth;
    private int pyramidHeight;

    public SquarePyramid(int x, int y, int z) {
        super(x, y, z);
    }

    public int getBaseCenter() {
        return baseCenter;
    }

    public void setBaseCenter(int baseCenter) {
        this.baseCenter = baseCenter;
    }

    public int getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(int baseWidth) {
        this.baseWidth = baseWidth;
    }

    public int getPyramidHeight() {
        return pyramidHeight;
    }

    public void setPyramidHeight(int pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }
}
