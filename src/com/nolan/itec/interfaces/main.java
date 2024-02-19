package com.nolan.itec.interfaces;

public class main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        AbstractShape shapes[] = new AbstractShape[]{circle, square};

        //using polymorphism
        for(AbstractShape shape : shapes){
            System.out.println(shape.getArea());
        }

        //not using polymorphism
        System.out.println(circle.getArea());
        System.out.println(square.getArea());

    }

}
