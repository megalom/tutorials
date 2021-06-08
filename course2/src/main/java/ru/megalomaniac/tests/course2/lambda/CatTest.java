package ru.megalomaniac.tests.course2.lambda;

import java.util.ArrayList;
import java.util.List;

public class CatTest {

    public static void filterCat(List<Cat> cats, CatCheck cc) {
        for (Cat cat : cats)
            if (cc.check(cat)) {
                System.out.println(cat);
            }
    }

    public static void main(String[] args) {
        System.out.println("Пример фильтрации котов с использованием лямбда выражения.");
        Cat cat1 = new Cat("Murzik", "white", 1);
        Cat cat2 = new Cat("Vasya", "brown", 3);
        Cat cat3 = new Cat("Barsik", "orange", 2);
        Cat cat4 = new Cat("Matroskin", "gray", 4);

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println("Список котов:");
        System.out.println(cats);
        System.out.println("Коты возрастом до 3х лет включительно:");
        filterCat(cats, (c) -> c.getAge() <= 3);
        System.out.println("Коты с длиной имени больше 5 букв:");
        filterCat(cats, (c) -> c.getName().length() > 5);
        System.out.println("Коты с именем Matroskin:");
        filterCat(cats, (c) -> c.getName().equalsIgnoreCase("Matroskin"));

    }
}
