package ru.megalomaniac.tests.course2.collection.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Britney");
        vector.add("Ashley");
        vector.add("Madonna");
        vector.add("Elizabeth");
        vector.add("Kate");
        vector.add("Marina");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
