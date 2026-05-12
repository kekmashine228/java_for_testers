package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(6.0, new Triangle(3, 4, 5).areaTri());
        Assertions.assertEquals(7.03, new Triangle(3.2, 4.4, 5.5).areaTri(), 0.01);
    }

    @Test
    void canCalculatePerimeterTriangle() {
        Assertions.assertEquals(12, new Triangle(3, 5, 4).perimeterTri());
        Assertions.assertEquals(12.5, new Triangle(3.2, 5.1, 4.2).perimeterTri());

    }

    @Test
    void cannotCreateTriangleWithNegativeSideA() {
        try {
            new Triangle(-5.0, 3.0, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }

    }

    @Test
    void cannotCreateTriangleWithNegativeSideB() {
        try {
            new Triangle(5.0, -3.0, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }

    }

    @Test
    void cannotCreateTriangleWithNegativeSideC() {
        try {
            new Triangle(5.0, 3.0, -4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }

    }

    @Test
    void cannotCreateTriangleWithThisSideA() {
        try {
            new Triangle(500, 3.0, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }

    }

    @Test
    void cannotCreateTriangleWithThisSideB() {
        try {
            new Triangle(3, 500, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }

    }

    @Test
    void cannotCreateTriangleWithThisSideC() {
        try {
            new Triangle(4, 3.0, 500);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }

    }
}
