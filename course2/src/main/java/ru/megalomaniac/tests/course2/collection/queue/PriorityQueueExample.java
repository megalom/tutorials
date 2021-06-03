package ru.megalomaniac.tests.course2.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(1);
        queue.add(7);
        queue.add(10);
        queue.add(8);

        System.out.println(queue); // Выведет данные, но они не будут отсортированы
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
