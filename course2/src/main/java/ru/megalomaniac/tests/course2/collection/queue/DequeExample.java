package ru.megalomaniac.tests.course2.collection.queue;

import javax.swing.*;
import java.util.*;

public class DequeExample {
    // Double ended queue - FIFO & LIFO - элементы могут использоваться с обоих концов
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerFirst(4);
        deque.offerLast(5);
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.peekLast());

        
    }
}
