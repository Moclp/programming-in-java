package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

import java.io.*;

/**
 * This class provides an implementation of a queue of integers using a linked list.
 */
public class LinkedListBasedImpl implements QueueOfInts, Serializable {

    private static class Node implements Serializable {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node front; // Front of the queue
    private Node rear;  // Rear of the queue

    /**
     * Constructs an empty queue.
     */
    public LinkedListBasedImpl() {
        this.front = this.rear = null;
    }

    /**
     * Adds an integer to the rear of the queue.
     *
     * @param x The integer to be added to the queue.
     */
    @Override
    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    /**
     * Removes and returns the integer from the front of the queue.
     *
     * @return The integer removed from the queue.
     * @throws EmptyQueueException If the queue is empty when trying to dequeue.
     */
    @Override
    public int dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }

        int removedValue = front.value;
        front = front.next;

        if (front == null) {
            rear = null; // If the last element is removed, update rear as well
        }

        return removedValue;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise.
     */
    @Override
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return The number of elements in the queue.
     */
    @Override
    public int numOfElems() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Returns the integer at the front of the queue without removing it.
     *
     * @return The integer at the front of the queue.
     * @throws EmptyQueueException If the queue is empty when trying to peek.
     */
    @Override
    public int peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return front.value;
    }

    /**
     * This is a custom checked exception class for handling cases when the queue is empty.
     */
    public class EmptyQueueException extends Exception {
        public EmptyQueueException(String message) {
            super(message);
        }
    }

    /**
     * Serializes the queue to a file.
     *
     * @param filename The name of the file to save the serialized data.
     */
    public void serialize(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserializes a saved queue from a file and returns a new instance of LinkedListBasedImpl.
     *
     * @param filename The name of the file containing the serialized data.
     * @return A new instance of LinkedListBasedImpl with the deserialized data, or null in case of errors.
     */
    public static LinkedListBasedImpl deserialize(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (LinkedListBasedImpl) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
