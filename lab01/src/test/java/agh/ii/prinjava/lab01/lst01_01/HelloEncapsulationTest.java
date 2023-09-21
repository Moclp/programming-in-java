package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {

    @Test
    public void testGetPropVal() {
        HelloEncapsulation helloEncapsulation = new HelloEncapsulation(1);
        int result = helloEncapsulation.getPropVal();
        assertEquals(1, result); //verify if two objects are equals, for not using if statement
    }

    @Test
    public void testSetPropVal() {
        HelloEncapsulation helloEncapsulation = new HelloEncapsulation(1);
        helloEncapsulation.setPropVal(2);
        int result = helloEncapsulation.getPropVal();
        assertEquals(2, result);
    }

    @Test
    public void testIsEncapsulated() {
        HelloEncapsulation helloEncapsulation = new HelloEncapsulation(3);
        boolean result = helloEncapsulation.isEncapsulated();
        assertTrue(result); // to verify if the whether the expected value is true or not
    }
}