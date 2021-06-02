package ru.megalomaniac.tests.course2.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap=
                new LinkedHashMap<>(16,0.75F,true);

        Student st1=new Student("Britney","Spears",3);
        Student st2=new Student("Ashley","Simpson",2);
        Student st3=new Student("Elizabeth","Olsen",1);
        Student st4=new Student("Maria","Baccarin",3);
        Student st5=new Student("Jessica","Simpson",2);
        Student st6=new Student("Bella","Swan",1);
        Student st7=new Student("Heather","Graham",4);

        linkedHashMap.put(3.4,st1);
        linkedHashMap.put(7.4,st2);
        linkedHashMap.put(5.2,st3);
        linkedHashMap.put(2.3,st4);

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(5.2));
        System.out.println(linkedHashMap.get(3.4));
        System.out.println(linkedHashMap);
    }
}
