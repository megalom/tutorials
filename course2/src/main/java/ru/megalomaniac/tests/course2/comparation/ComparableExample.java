package ru.megalomaniac.tests.course2.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<String> list= new ArrayList();
        list.add("Ivan");
        list.add("Pavel");
        list.add("Eugen");
        list.add("Viktoria");
        list.add("Maria");
        System.out.println("Before sort:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort:");
        System.out.println(list);
    }

}
