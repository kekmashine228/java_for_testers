package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println("ru.stqa.geometry.figures.Square area with side " + side + " = " + squareArea(side));
    }

    public static double squareArea(double side) {
        return side * side;
    }
}
