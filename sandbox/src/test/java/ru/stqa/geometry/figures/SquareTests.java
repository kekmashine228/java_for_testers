package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }


    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20,  new Square(5.0).perimeter());
    }

    @Test
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(6.0, new Triangle(3,4,5).areaTri());
        Assertions.assertEquals(7.03, new Triangle(3.2,4.4,5.5).areaTri(),0.01);
    }
    @Test
    void canCalculatePerimeterTriangle() {
        Assertions.assertEquals(12,new Triangle(3,5,4).perimeterTri());
        Assertions.assertEquals(12.5,new Triangle(3.2,5.1,4.2).perimeterTri());

    }

}
