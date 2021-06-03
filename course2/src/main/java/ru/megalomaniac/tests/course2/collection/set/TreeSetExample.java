package ru.megalomaniac.tests.course2.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    // В основе TreeSet лежит TreeMap. Все по аналогиис HashSet но по отношению к TreeMap
    // Хранит элементы в отсортированном порядке. В основе лежит красно черное дерево.
    // TreeSet null хранить не может
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);

        System.out.println(treeSet);
    }
}
