package ru.megalomaniac.tests.course2.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class GenericsExample2 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        //list.add("Hello");

        //bounded wildcards
        List<? extends Number> list3 = new ArrayList<Integer>();

        List<Double> list1= new ArrayList<>();
        list1.add(3.14);
        list1.add(3.5);
        list1.add(3.9);

        showListInfo(list1);

        List<String> list2= new ArrayList<>();
        list2.add("Hello");
        list2.add("Bye");
        list2.add("OK");

        showListInfo(list2);

        ArrayList<Double> listDouble= new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(3.5);
        listDouble.add(3.9);
        System.out.println(summ(listDouble));

        ArrayList<Integer> listInteger= new ArrayList<>();
        listInteger.add(2);
        listInteger.add(4);
        listInteger.add(6);
        System.out.println(summ(listInteger));


    }

    public static double summ(ArrayList<? extends Number> arrayList){
        double sum=0;
        for(Number n: arrayList){
            sum+=n.doubleValue();
        }
        return sum;
    }

    static void showListInfo(List<?> list){
        System.out.println("List contains: "+list);
    }
}
