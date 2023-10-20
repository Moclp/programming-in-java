/**
 * A double-linked list-based implementation of the MyQueue interface.
 *
 * @param <E> the type of elements stored in the queue
 */
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * My QueueDLLBImpl represent a queue data structure
 * @param <E>
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /**
     * Constructs a new instance of MyQueueDLLBImpl.
     * Initializes an empty double-linked list for storing elements.
     */
    public MyQueueDLLBImpl() {
        elems = new DLinkList<>();
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param x the element to be added to the queue
     */
    @Override
    public void enqueue(E x) {
        if (elems.size() == 0) {
            elems.addFirst(x);
        } else {
            elems.addLast(x);
        }
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    @Override
    public E dequeue() {
        if (elems.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        E front = elems.getFirst();
        elems.removeFirst();
        return front;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements in the queue
     */
    @Override
    public int numOfElems() {
        return elems.size();
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return the element at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    @Override
    public E peek() {
        if (elems.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elems.getFirst();
    }

    /**
     * Returns a string representation of the elements in the queue.
     *
     * @return a string representation of the queue elements
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
