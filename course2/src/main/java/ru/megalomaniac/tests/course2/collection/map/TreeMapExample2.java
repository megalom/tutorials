package ru.megalomaniac.tests.course2.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        // Ключ доожен реализовывать интерфейс Comparable, в противном случае при
        // создании treeMap необходимо указать компаратор
        // TreeMap<Student,Double> treeMap = new TreeMap<>(new Comparator<Student>(){@Override});
        TreeMap<Student,Double> treeMap = new TreeMap<>();
        TreeMap<Student,Double> treeMap2= new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Student st1=new Student("Britney","Spears",3);
        Student st2=new Student("Ashley","Simpson",2);
        Student st3=new Student("Elizabeth","Olsen",1);
        Student st4=new Student("Maria","Baccarin",3);
        Student st5=new Student("Jessica","Simpson",2);
        Student st6=new Student("Bella","Swan",1);
        Student st7=new Student("Heather","Graham",4);

        treeMap.put(st1,5.8);
        treeMap.put(st2,3.2);
        treeMap.put(st3,6.4);
        treeMap.put(st4,4.5);
        treeMap.put(st5,8.3);
        treeMap.put(st6,2.3);
        treeMap.put(st7,6.2);

        System.out.println(treeMap);
    }
}
