package ru.stqa.geometry.figures;

public record Square (double side){

    public Square {
        if (side < 0) {
            throw new IllegalArgumentException("Square side should be non-negative");
        }
    }


    public static void printSquareArea(Square s) {
        System.out.println("ru.stqa.geometry.figures.Square area with side " + s.side + " = " + s.area());
    }



    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
