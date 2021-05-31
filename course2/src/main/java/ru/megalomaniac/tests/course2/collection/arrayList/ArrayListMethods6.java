package ru.megalomaniac.tests.course2.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("Britney");
        arrayList1.add("Ashley");
        arrayList1.add("Madonna");
        arrayList1.add("Elizabeth");
        arrayList1.add("Kate");
        arrayList1.add("Marina");

        List<Integer> list1 = List.of(3,8,13); // Java 9+, неизменяемый лист, не может содержать Null
        System.out.println(list1);
        //list1.add(100); // выкенет Exception

        List<String> list2 = List.copyOf(arrayList1); // Java 10+, неизменяемый лист, не может содержать Null


    }
}
