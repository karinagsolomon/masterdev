package inheritance;

import objects.Rectangles;

public class InheritanceTester {
    public static void main(String[] args) {
        // Person person = new Person();
        // Employee employee = new Employee();

        Square square = new Square();
        square.setLength(25);
        System.out.println(square.calculatePerimeter());

        Rectangles rectangles = new Rectangles();
        rectangles.print();
        square.print("square");
    }
}
