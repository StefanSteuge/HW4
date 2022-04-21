package com.cursor;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(5, -5, 4, 9);
        Shape rectangle = new Rectangle(2,5,7,8);
        Shape triangle = new Triangle(2, -1, 8, -2, 2, 5);
        Shape sphere = new Sphere(-2, 6, 8, 2, -1, 3);
        Shape squarePyramid = new SquarePyramid(9, 12, 18, 4, -5, 8);
        Shape cuboid = new Cuboid(1, 2, -3, 4, -3, 8);
     Shape[] shapes = {circle,rectangle,triangle,sphere,squarePyramid,cuboid};

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
