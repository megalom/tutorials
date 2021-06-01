package ru.megalomaniac.tests.course2.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

// Итератор нужен, чтобы пробежаться по элементам

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("Britney");
        arrayList1.add("Ashley");
        arrayList1.add("Madonna");
        arrayList1.add("Elizabeth");
        arrayList1.add("Kate");
        arrayList1.add("Marina");

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            iterator.next();//Если не переходим к следующему элементу то remove выкинет Exception
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
