package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListBasedImplTest {

    // Create an empty queue
    private final QueueOfInts queueOfInts = QueueOfIntsFtry.create(QueueOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newQueueIsEmpty() {
        assertTrue(queueOfInts.isEmpty());
    }
    @Test
    public void testEnqueueAndDequeue() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.peek());
        queue.dequeue();
        assertEquals(2, queue.peek());
        queue.dequeue();
        assertEquals(3, queue.peek());
    }

    @Test
    public void testDequeueEmptyQueue() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        assertTrue(queue.isEmpty());

        assertThrows(LinkedListBasedImpl.EmptyQueueException.class, () -> {
            queue.dequeue();
        });
    }

    @Test
    public void testPeekEmptyQueue() {
        LinkedListBasedImpl queue = new LinkedListBasedImpl();
        assertTrue(queue.isEmpty());

        assertThrows(LinkedListBasedImpl.EmptyQueueException.class, () -> {
            queue.peek();
        });
    }

    @Test
    public void testSerializationAndDeserialization() {
        LinkedListBasedImpl originalQueue = new LinkedListBasedImpl();
        originalQueue.enqueue(1);
        originalQueue.enqueue(2);
        originalQueue.enqueue(3);

        originalQueue.serialize("testQueue.ser");

        LinkedListBasedImpl deserializedQueue = LinkedListBasedImpl.deserialize("testQueue.ser");
        assertNotNull(deserializedQueue);

        assertEquals(1, deserializedQueue.dequeue());
        assertEquals(2, deserializedQueue.dequeue());
        assertEquals(3, deserializedQueue.dequeue());
        assertTrue(deserializedQueue.isEmpty());
    }
}
