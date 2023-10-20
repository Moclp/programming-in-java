package agh.ii.prinjava.proj1.impl;

import static org.junit.jupiter.api.Assertions.*;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the MyStackDLLBImpl class.
 */
public class MyStackDLLBImplTest {

    private MyStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = MyStack.create();}

    /**
     * Test the push method.
     * This test ensures that an element can be pushed onto the stack.
     */
    @Test
    void testPush() {
        assertTrue(stack.isEmpty());
        stack.push(18);
        stack.push(39);
        System.out.println(stack.toString());
        assertEquals(39, stack.peek());
    }

    /**
     * Test the pop method.
     * This test ensures that an element can be popped from the stack and that
     * the top element is correctly updated after the pop operation.
     */
    @Test
    void testPop() {
        assertTrue(stack.isEmpty());
        // stack.pop(); Checking if the stack is empty
        stack.push(18);
        stack.push(39);
        System.out.println(stack.toString());
        assertEquals(39, stack.pop());
        System.out.println(stack.toString());
        assertEquals(18, stack.peek());
    }

    /**
     * Test the peek method.
     * This test ensures that the top element can be viewed without removing it.
     */
    @Test
    void testPeek() {
//      stack.peek(); Checking if the stack is empty
        stack.push(39);
        stack.push(18);
        System.out.println(stack.toString());
        assertEquals(18, stack.peek());
    }

    /**
     * Test the numOfElems method.
     * This test ensures that the method correctly reports the number of elements on the stack.
     */
    @Test
    void testNumOfElems() {
        stack.push(18);
        System.out.println(stack.toString());
        assertEquals(stack.numOfElems(), 1);
        stack.push(39);
        System.out.println(stack.toString());
        assertEquals(2, stack.numOfElems());
        stack.push(50);
        System.out.println(stack.toString());
        assertEquals(3, stack.numOfElems());
    }
}
