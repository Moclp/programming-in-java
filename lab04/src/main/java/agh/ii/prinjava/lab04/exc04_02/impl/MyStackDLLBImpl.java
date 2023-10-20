package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

/**
 * MyStackDLLBImpl represent a stack data structure
 * @param <E> type of elements stored in the stack
 */
public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;
    /**
     * Constructs a new instance of MyStackDLLBImpl.
     * Initializes an empty double-linked list for storing elements.
     */
    public MyStackDLLBImpl() {
        elems = new DLinkList<>();
    }

    /**
     * Removes and returns the top element from the stack.
     * @return the top element from the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public E pop() {
        if (elems == null || elems.getFirst() == null) {
            throw new IllegalStateException("The stack is empty");
        }
        E topElem = elems.getFirst();
        elems.removeFirst();
        return topElem;
    }

    /**
     * Adds an element to the top of the stack.
     * @param x the element to be added to the stack
     */
    @Override
    public void push(E x) {
        if (elems == null) {
            elems = new DLinkList<>();
        }
        elems.addFirst(x);
    }

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return elems.size();
    }

    /**
     * Returns the top element from the stack without removing it.
     * @return the top element from the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public E peek() {
        if (elems == null || elems.getFirst() == null) {
            throw new IllegalStateException("The stack is empty");
        }
        return elems.getFirst();
    }

    /**
     * Returns a string representation of the elements in the stack.
     * @return a string representation of the elements in the stack
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
