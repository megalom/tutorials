package ru.megalomaniac.tests.course2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Maria");

        System.out.println("Исходный список");
        System.out.println(arrayList);
        System.out.println("Отсортированный список");
        arrayList=arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(arrayList);
    }
}
