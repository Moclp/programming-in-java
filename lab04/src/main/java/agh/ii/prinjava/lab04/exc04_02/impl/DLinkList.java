package agh.ii.prinjava.proj1.impl;

/**
 * DLinkList represent a list data structure
 * @param <E> type of elements stored in the list
 */
public class DLinkList<E> {
    private Node<E> first;
    private Node<E> last;
    private int count = 0;  // To keep track of the number of elements in the list

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    /**
     * adds an element at the top of the list
     * @param elem added at the top of the list
     */
    public void addFirst(E elem){
        Node<E> newNode = new Node<>();
        newNode.elem = elem;
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        System.out.println("First element you added : " + elem);
        count++;
    }

    /**
     * adds an element at the end of the list
     * @param elem added at the end of the list
     */
    public void addLast(E elem){
        Node<E> newNode = new Node<>();
        newNode.elem = elem;
        if (last == null) {
            last = newNode;
            first = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        System.out.println("Last element you added : " + elem);
        count++;
    }

    /**
     * removes the first element from the list
     */
    public void removeFirst(){
        if (first != null) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            System.out.println("First element is removed.");
            count--;
        } else {
            System.out.println("There is nothing to remove; it's empty.");
        }
    }

    /**
     * removes the last element from the list
     */
    public void removeLast(){
        if (last != null) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
            System.out.println("Last element is removed.");
            count--;
        } else {
            System.out.println("There is nothing to remove; it's empty.");
        }
    }

    /**
     * string representation of the list
     * @return a string representing the elements in the list
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> tmp = first;
        while (tmp != null){
            sb.append(tmp.elem);
            if (tmp.next != null){
                sb.append(",");
            }
            tmp = tmp.next;
        }
        sb.append("]");
        System.out.println("List : " + sb.toString());
        return sb.toString();
    }

    /**
     * Returns the number of elements in the list.
     * @return the number of elements in the list
     */
    public int size() {
        return count;
    }

    /**
     * Returns the first element of the list without removing it.
     * @return the first element of the list
     */
    public E getFirst() {
        if (first != null) {
            return first.elem;
        } else {
            throw new IllegalStateException("The list is empty");
        }
    }
}
