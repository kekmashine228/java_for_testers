package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println("ru.stqa.geometry.figures.Square area with side " + side + " = " + area(side));
    }

    public static double area(double side) {
        return side * side;
    }


    public static double perimeter(double a) {
        return 4 * a;
    }
}
