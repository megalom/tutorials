package ru.megalomaniac.tests.course2.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Maria");

        System.out.println("Изначальный список имен:");
        System.out.println(arrayList);

        // метод в цикле
        /*
        for(int i=0;i<arrayList.size();i++){
            arrayList.set(i,String.valueOf(arrayList.get(i).length()));
        }*/
        // стрим преобразовывает методом map каждый элемент в длину строки при помощи лямбда функции
        List<Integer> list2 = arrayList.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println("Список из длин имен:");
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));

        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0)
                element = element / 3;
            return element;
        }).toArray();

        System.out.println("После обработки в стриме:");
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<String>();
        set.add("Britney");
        set.add("Ashley");
        set.add("Madonna");
        set.add("Elizabeth");
        set.add("Maria");

        System.out.println("Set:");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(element->element.length()).collect(Collectors.toSet());
        List<Integer> set3 = set.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println("Длины в сете(отсортированые):");
        System.out.println(set2);
        System.out.println("Длины из сета в листе:");
        System.out.println(set3);

    }
}
