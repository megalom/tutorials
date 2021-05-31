package ru.megalomaniac.tests.course2.collection.arrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();

        arrayList1.add("Britney");
        arrayList1.add("Ashley");
        arrayList1.add("Madonna");

        System.out.println(arrayList1);

        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(arrayList2);

        System.out.println(arrayList1);

        arrayList1.addAll(1,arrayList2);
        System.out.println(arrayList1);

        System.out.println("Britney contains test:");
        System.out.println(arrayList1.contains("Britney"));

        arrayList1.clear();
        System.out.println("Cleared array: "+arrayList1);
        System.out.println(arrayList1.isEmpty());
    }
}
