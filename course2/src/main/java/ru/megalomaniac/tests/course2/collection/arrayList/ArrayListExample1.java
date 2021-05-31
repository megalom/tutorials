package ru.megalomaniac.tests.course2.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Начальное значение capacity = 10
        // При достижении size = capacity создается новый массив размером Х2 и в него переносятся значения из
        // старого массива
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Britney");
        stringList.add("Ashley");
        stringList.add("Madonna");

        // Вручную указываем capacity при создании ArrayList
        ArrayList<String> stringList2 = new ArrayList<>(200);
        stringList2.add("element1");
        stringList2.add("element2");

        List<String> stringList3 = new ArrayList<>();

        // Создается новый arrayList с на основании другого arrayList( сами листы - разные объекты,
        // но ссылаются в списках на одни и те же объекты
        ArrayList<String> stringList4 = new ArrayList<>(stringList);


        System.out.println(stringList);
        System.out.println(stringList2);
        System.out.println(stringList4);
    }
}
