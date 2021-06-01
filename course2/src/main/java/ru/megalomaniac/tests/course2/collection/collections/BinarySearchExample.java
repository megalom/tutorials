package ru.megalomaniac.tests.course2.collection.collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(-4);
        arrayList.add(9);
        arrayList.add(13);
        arrayList.add(2);
        arrayList.add(-9);
        arrayList.add(20);
        arrayList.add(11);
        arrayList.add(1);
        System.out.println("Исходный массив:");
        System.out.println(arrayList);

        System.out.println("Отсортированный массив:");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        int index1= Collections.binarySearch(arrayList,11);
        System.out.println("Индекс числа 11 = "+index1);

        System.out.println("Перевернутый массив:");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        System.out.println("Перемешанный массив:");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);




    }

}
