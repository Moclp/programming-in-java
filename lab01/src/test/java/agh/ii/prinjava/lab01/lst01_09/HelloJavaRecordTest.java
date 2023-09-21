package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaRecordTest {
    @Test
    void testConstructorAndGetters() {
        HelloJavaRecord hjr = new HelloJavaRecord(1, "abc");
        assertEquals(1, hjr.i1());
        assertEquals("abc", hjr.s1());
    }

}