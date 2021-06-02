package ru.megalomaniac.tests.course2.collection.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // В tree map ключи уникальны, если добавлять элемент с
        // существующим ключем - происходит перезапись. ортировка происходит по
        // ключу. TreeMap реализована через красно-черное дерево.

        TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student st1=new Student("Britney","Spears",3);
        Student st2=new Student("Ashley","Simpson",2);
        Student st3=new Student("Elizabeth","Olsen",1);
        Student st4=new Student("Maria","Baccarin",3);
        Student st5=new Student("Jessica","Simpson",2);
        Student st6=new Student("Bella","Swan",1);
        Student st7=new Student("Heather","Graham",4);

        treeMap.put(5.2, st1);
        treeMap.put(7.4, st2);
        treeMap.put(8.8, st3);
        treeMap.put(4.7, st4);
        treeMap.put(2.3, st5);
        treeMap.put(3.5, st6);
        treeMap.put(10.6, st7);
        System.out.println("Исходный treeMap:");
        System.out.println(treeMap);
        System.out.println("Элемент по ключу 5.2:");
        System.out.println(treeMap.get(5.2));
        System.out.println("Удаляем по ключу 3.5:");
        treeMap.remove(3.5);
        System.out.println(treeMap);
        System.out.println("По убыванию ключа:");
        System.out.println(treeMap.descendingMap());
        System.out.println("Отрезок от 5 до конца:");
        System.out.println(treeMap.tailMap(5.0,true));
        System.out.println("Отрезок от начала до 5:");
        System.out.println(treeMap.headMap(5.0,false));
        System.out.println("Элемент с нивысшим значением ключа:");
        System.out.println(treeMap.lastEntry());
        System.out.println("Элемент с наименьшим значением ключа:");
        System.out.println(treeMap.firstEntry());



    }
}
