package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloImmutableTest {
    @Test
    void testConstructorAndGetters() {
        HelloImmutable hi = new HelloImmutable(1, "abc");
        assertEquals(1, hi.getI1());
        assertEquals("abc", hi.getS1());
    }

}