package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 5 * 5, circle.area(), 0.001);
    }

    @Test
    void testCirclePerimeter() {
        Circle circle = new Circle(5);
        assertEquals(2 * Math.PI * 5, circle.perimeter(), 0.001);
    }
}