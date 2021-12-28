package com.cursor;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(5, -5, 4, 9);
        Shape rectangle = new Rectangle(7, 3, 1, -7);
        Triangle triangle = new Triangle(2, -1, 8, -2);
        Sphere sphere = new Sphere(-2, 6, 8, 2, -1, 3);
        SquarePyramid squarePyramid = new SquarePyramid(9, 12, 18, 4, -5, 8);
        Cuboid cuboid = new Cuboid(1, 2, -3, 4, -3, 8);
        double getDistance;
        Shape[] shapes = new Shape[6];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;
        shapes[3] = sphere;
        shapes[4] = squarePyramid;
        shapes[5] = cuboid;
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}

