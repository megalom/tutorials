package ru.megalomaniac.tests.course2.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    // queue - очередь FIFO
    // Класс linkedList имплементирует не только интерфейс List, но и интерфейс Deque
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Britney");
        queue.add("Ashley");
        queue.add("Madonna");
        queue.offer("Elizabeth");
        queue.offer("Monica");

        System.out.println(queue);
        System.out.println("Remove elements in queue");
        System.out.println(queue.remove()); // если элементов больше не осталось то выкидывается исключение
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        try {
            System.out.println(queue.remove());
        }
        catch (Exception e){
            System.out.println("Выброшено исключение, т.к. элементов в очереди не осталось, и удалять нечего.");
        }

        System.out.println(queue);

        queue.add("Britney");
        queue.add("Ashley");
        queue.add("Madonna");
        queue.offer("Elizabeth");
        queue.offer("Monica");

        System.out.println("Remove elements again with poll:");
        System.out.println(queue.poll());// не выбросит исключение, а вернет null
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        queue.add("Britney");
        queue.add("Ashley");
        queue.add("Madonna");
        queue.offer("Elizabeth");
        queue.offer("Monica");

        System.out.println("Первый эелемент: "+queue.element()); //показывает первый эелемент в очереди,
        // при отсутствии элемента - исключение

        System.out.println("Первый эелемент: "+queue.peek()); //показывает первый эелемент в очереди,
        // при отсутствии элемента - исключение не выбрасывается, а возвращается null

        queue.remove("Madonna"); // удаление эемента из середины (не рекомендуется так делать)
        System.out.println(queue);

    }
}
