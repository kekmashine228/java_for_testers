package ru.stqa.geometry.figures;

public record Rectangle (double a, double b) {

    public static void printRectangleArea(double sideA, double sideB) {
        System.out.println("Area of a ru.stqa.geometry.figures.Rectangle with sides " + sideA + " and " + sideB + " = " + squareRectangle(sideA, sideB));
    }

    private static double squareRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }
}
