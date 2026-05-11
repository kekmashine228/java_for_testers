package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {

    public double areaTri() {
        var p = perimeterTri() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double perimeterTri() {
        return this.a + this.b + this.c;
    }


}
