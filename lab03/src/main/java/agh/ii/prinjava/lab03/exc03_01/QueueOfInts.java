package agh.ii.prinjava.lab03.exc03_01;

/**
 * This interface represents a queue of integers.
 */
public interface QueueOfInts {
    /**
     * Adds an integer to the rear of the queue.
     *
     * @param x The integer to be added to the queue.
     */
    void enqueue(int x);

    /**
     * Removes and returns the integer from the front of the queue.
     *
     * @return The integer removed from the queue.
     * @throws EmptyQueueException If the queue is empty when trying to dequeue.
     */
    int dequeue() throws EmptyQueueException;

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise.
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return The number of elements in the queue.
     */
    int numOfElems();

    /**
     * Returns the integer at the front of the queue without removing it.
     *
     * @return The integer at the front of the queue.
     * @throws EmptyQueueException If the queue is empty when trying to peek.
     */
    int peek();
}
