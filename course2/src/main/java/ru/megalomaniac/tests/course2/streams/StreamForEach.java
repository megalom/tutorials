package ru.megalomaniac.tests.course2.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Maria");
        System.out.println("Исходный список: ");
        arrayList.stream().forEach(System.out::println);
        System.out.println("Удвоенное количество символов в имени: ");
        arrayList.stream().forEach(StreamForEach::printX2);

        Stream<Integer> stream = Stream.of(3,5,2,9,1,4);
        stream.forEach(System.out::println);

    }

    public static void printX2(String x){
        System.out.println(x.length()*2);
    }
}
