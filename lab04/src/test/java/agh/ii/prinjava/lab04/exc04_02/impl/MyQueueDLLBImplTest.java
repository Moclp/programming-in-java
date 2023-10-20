/**
 * This class contains JUnit test cases for the MyQueueDLLBImpl class.
 */
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the MyQueueDLLBImpl class.
 */
class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();


    /**
     * Sets up the test environment by creating a new instance of MyQueueDLLBImpl
     * before each test case.
     */
    @BeforeEach
    void setUp() {
        queueOfInts = new MyQueueDLLBImpl<>();
    }

    /**
     * Tests the enqueue and dequeue operations of the queue.
     */
    @Test
    void testEnqueueDequeue() {
        assertTrue(queueOfInts.isEmpty());
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        System.out.println(queueOfInts.toString());
        assertEquals(1, queueOfInts.dequeue());
        System.out.println(queueOfInts.toString());
    }

    /**
     * Tests the peek operation of the queue.
     */
    @Test
    void testPeek() {
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(20);
        System.out.println(queueOfInts.toString());
        assertEquals(10, queueOfInts.peek());
        queueOfInts.dequeue();
        System.out.println(queueOfInts.toString());
        assertEquals(20, queueOfInts.peek());
        queueOfInts.dequeue();
        System.out.println(queueOfInts.toString());
        assertThrows(IllegalStateException.class, () -> queueOfInts.peek());
    }

    /**
     * Tests the numOfElems operation of the queue.
     */
    @Test
    void testNumOfElems() {
        assertEquals(0, queueOfInts.numOfElems());
        queueOfInts.enqueue(1);
        System.out.println(queueOfInts.toString());
        assertEquals(1, queueOfInts.numOfElems());

        queueOfInts.enqueue(2);
        System.out.println(queueOfInts.toString());
        assertEquals(2, queueOfInts.numOfElems());

        queueOfInts.dequeue();
        System.out.println(queueOfInts.toString());
        assertEquals(1, queueOfInts.numOfElems());

        queueOfInts.dequeue();
        System.out.println(queueOfInts.toString());
        assertEquals(0, queueOfInts.numOfElems());
    }

    /**
     * Cleans up the test environment after each test case (not used in this test class).
     */
    @AfterEach
    void tearDown() {
    }
}