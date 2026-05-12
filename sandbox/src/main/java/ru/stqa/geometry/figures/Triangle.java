package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {

    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side");
        }

    }

    public double areaTri() {
        var p = perimeterTri() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double perimeterTri() {
        return this.a + this.b + this.c;
    }

    static boolean isValidTriangle(double a, double b, double c) {
        double max = Math.max(Math.max(a, b), c);
        return (a + b + c - max) > max;
    }
}
