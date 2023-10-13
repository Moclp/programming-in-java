package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

import java.io.*;

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

    public LinkedListBasedImpl() {
        this.front = this.rear = null;
    }

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

    @Override
    public int peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return front.value;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    public class EmptyQueueException extends Exception {
        public EmptyQueueException(String message) {
            super(message);
        }
    }

    public void serialize(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedListBasedImpl deserialize(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)) ){
            return (LinkedListBasedImpl) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
