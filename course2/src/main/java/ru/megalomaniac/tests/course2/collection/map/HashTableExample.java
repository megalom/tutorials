package ru.megalomaniac.tests.course2.collection.map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // В Hashtable ни ключ ни значение не могут быть Null

        Hashtable<Double,Student> hashTable = new Hashtable<>();
        Student st1=new Student("Britney","Spears",3);
        Student st2=new Student("Ashley","Simpson",2);
        Student st3=new Student("Elizabeth","Olsen",1);
        Student st4=new Student("Maria","Baccarin",3);
        Student st5=new Student("Jessica","Simpson",2);
        Student st6=new Student("Bella","Swan",1);
        Student st7=new Student("Heather","Graham",4);

        hashTable.put(5.2, st1);
        hashTable.put(2.3, st2);
        hashTable.put(4.2, st3);
        hashTable.put(1.2, st4);


    }
}
