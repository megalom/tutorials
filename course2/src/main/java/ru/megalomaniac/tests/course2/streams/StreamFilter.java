package ru.megalomaniac.tests.course2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Maria");
        System.out.println("Исходный список: ");
        System.out.println(arrayList);
        List<String> list = arrayList.stream().filter(
                e->e.length()<=6).collect(Collectors.toList()
        );
        System.out.println("Отфильтрованый по длине имени список: ");
        System.out.println(list);

    }
}
