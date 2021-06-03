package ru.megalomaniac.tests.course2.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // HashSet использует внутри HashMap, Ключ map - значение Set, занчение map - заглушка(константа)
        // HashSet не хранит порядок добавления элементов.
        // HashSet хранит только уникальные значения.
        // Работает так же быстро как HashMap
        // HashSet допускает значение Null
        // Для собственных классах необходимо переобрпеделить Equals и HashCode

        Set<String> set=new HashSet<>();
        set.add("Britney");
        set.add("Ashley");
        set.add("Madonna");
        set.add("Elizabeth");

        System.out.println(set);
        for(String s : set){
            System.out.println("Name: "+s+"\n");
        }

        System.out.println("Add Britney");
        set.add("Britney");
        System.out.println(set);

        System.out.println("Remove Britney");
        set.remove("Britney");
        System.out.println(set);

        System.out.println("Set size: "+set.size());
        System.out.println("Set empty: "+set.isEmpty());
        System.out.println("Set contains Misha: "+set.contains("Misha"));

    }
}
