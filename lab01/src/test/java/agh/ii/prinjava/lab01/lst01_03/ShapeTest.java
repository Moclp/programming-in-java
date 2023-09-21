package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testIsFilled() {
        Shape shape = new Circle(5);
        assertTrue(shape.isFilled());
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }
}