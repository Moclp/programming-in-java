package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsafeSingletonTest {

    void testGetInstance() {
        UnsafeSingleton instance1 = UnsafeSingleton.getInstance();
        UnsafeSingleton instance2 = UnsafeSingleton.getInstance();
        assertSame(instance1, instance2, "Instances are not the same");
    }
}