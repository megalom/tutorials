package ru.megalomaniac.tests.course2.generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        int a = GenMethod.getSecondElement(al);
        System.out.println("Second element: "+a);

        ArrayList<String> al2= new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String a2 = GenMethod.getSecondElement(al2);
        System.out.println("Second element: "+a2);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
