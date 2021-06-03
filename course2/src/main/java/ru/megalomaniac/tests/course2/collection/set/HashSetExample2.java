package ru.megalomaniac.tests.course2.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(5);
        setA.add(2);
        setA.add(3);
        setA.add(1);
        setA.add(8);

        setB.add(7);
        setB.add(4);
        setB.add(3);
        setB.add(5);
        setB.add(8);

        System.out.println("Set A");
        System.out.println(setA);

        System.out.println("Set B");
        System.out.println(setB);

        // Union
        HashSet<Integer> union= new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("union A and B: ");
        System.out.println(union);

        // Intersect
        HashSet<Integer> intersect= new HashSet<>(setA);
        intersect.retainAll(setB);
        System.out.println("intersect A and B: ");
        System.out.println(intersect);

        // Subtract
        HashSet<Integer> subtract= new HashSet<>(setA);
        subtract.removeAll(setB);
        System.out.println("subtract A and B: ");
        System.out.println(subtract);

    }
}
