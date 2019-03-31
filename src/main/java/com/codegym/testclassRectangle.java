package com.codegym;

import java.util.Scanner;

public class testclassRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width for rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height for rectangle: ");
        double height = scanner.nextDouble();

        rectangle rectangle = new rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Perimeter of Rectangle is: "+ rectangle.getPerimeter());
        System.out.println("Area of Rectangle is: "+ rectangle.getArea());
    }
}
