package ru.megalomaniac.tests.course2.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("Britney");
        arrayList1.add("Ashley");
        arrayList1.add("Madonna");
        arrayList1.add("Elizabeth");
        arrayList1.add("Kate");
        arrayList1.add("Marina");

        List<String> subList = arrayList1.subList(3,6); // создает List из диапахлга элементов в
        // Array List (диапазон не включет индекс последнего элемента. Полученный List является представлением
        // arrayList1 (т.е. связан с arrayList1). Если после создания subList менять arrayList - вылетит Exception
        System.out.println("sublist:");
        System.out.println(subList);
        subList.add("Chloe");

        ArrayList<String> arrayList2 = new ArrayList<String>();

        arrayList2.add("Madonna");
        arrayList2.add("Elizabeth");
        arrayList2.add("Jessica");
        arrayList2.add("Christina");

        ArrayList<String> arrayList3 = new ArrayList<String>();

        arrayList3.add("Britney");
        arrayList3.add("Ashley");

        System.out.println(arrayList1);
        arrayList1.removeAll(arrayList2); // Удаляет из array list элементы, содержащиеся во втором arrayList
        System.out.println("After delete:");
        System.out.println(arrayList1);

        System.out.println("arrayList1 содержит все элементы arrayList3: ");
        boolean contains=arrayList1.containsAll(arrayList3); // содержит ли первый лист все элементы второго листа
        System.out.println(contains);

        arrayList1.retainAll(arrayList3);// Удаляет из array list все элементы, кроме содержащихся во втором arrayList
        System.out.println("After retainAll:");
        System.out.println(arrayList1);

        System.out.println("Конвертируем в массив");
        Object[] array = arrayList1.toArray();
        String[] stringArray = arrayList1.toArray(new String[0]); //Если не знаем какой размер массива -
        // пишем [0] - Java сама уеличит размер до нужного.
        for(String s:stringArray){
            System.out.println(s);
        }

    }
}
