package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this class contains test methods for each method
 */
class   DLinkListTest {
    DLinkList<Integer> dLinkList ;

    /**
     * sets up a new DLinkList instance before each test
     */
    @BeforeEach
    void setUp() {
        dLinkList = new DLinkList<>();
    }

    /**
     * after each test that will be clean the DLinkList
     */
    @AfterEach
    void tearDown() {
        dLinkList = null;
    }

    /**
     * adds a new element at the head of the list and verify that it has been added correctly by comparison
     */
    @Test
    void addFirst() {
        dLinkList.addFirst(5);
        dLinkList.addFirst(5);
        assertEquals("[5,5]", dLinkList.toString());
    }

    /**
     * adds a new element at the end of the list and verify that it has been added correctly by comparison
     */
    @Test
    void addLast() {
        dLinkList.addLast(28);
        assertEquals("[28]", dLinkList.toString());
    }

    /**
     * removes an element at the head of the list and verify that it has been added correctly by comparison
     */
    @Test
    void removeFirst() {
        dLinkList.addFirst(19);
        dLinkList.addFirst(28);
        dLinkList.removeFirst();
        assertEquals("[19]", dLinkList.toString());
    }

    /**
     * removes an element at the end of the list and verify that it has been added correctly by comparison
     */
    @Test
    void removeLast() {
        dLinkList.addFirst(19);
        dLinkList.addFirst(28);
        dLinkList.removeLast();
        assertEquals("[28]", dLinkList.toString());
    }

    /**
     * Adds elements to the list and checks if the toString method returns the correct string representation
     */
    @Test
    void testToString() {
        dLinkList.addFirst(19);
        dLinkList.addFirst(28);
        dLinkList.addLast(15);
        assertEquals("[28,19,15]", dLinkList.toString());
    }
}