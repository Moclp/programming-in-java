package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(2 * 5, rectangle.area(), 0.001);
    }

    @Test
    void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(2 * (2 + 5), rectangle.perimeter(), 0.001);
    }
}