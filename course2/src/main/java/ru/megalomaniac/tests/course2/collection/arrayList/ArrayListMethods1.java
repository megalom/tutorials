package ru.megalomaniac.tests.course2.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Britney");
        arrayList1.add("Ashley");
        arrayList1.add("Madonna");
        arrayList1.add(1,"Tracy"); // Если индекс будет больше, чем size -> Throw Exception

        showArray(arrayList1);

        System.out.println("Был вставлен по индексу 1 элемент :"+arrayList1.get(1));
        arrayList1.set(1,"Grace");
        System.out.println("Элемент под индексом 1 меняется на Grace");

        showArray(arrayList1);

        System.out.println("Удаляем элемент под индексом 1");
        arrayList1.remove(1);

        showArray(arrayList1);
    }

    public static void showArray(List<String> arrayList){
        int i=0;
        for (String s:arrayList){
            System.out.println(i+":"+s);
            i++;
        }
    }
}
