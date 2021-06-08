package ru.megalomaniac.tests.course2.lambda.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Maria");

        arrayList.add("Lin");
        System.out.println("Изначальный список");
        System.out.println(arrayList);

        arrayList.removeIf(element->element.length()<6);
        System.out.println("Список после удаления при помощи предиката:");
        System.out.println(arrayList);
        arrayList.clear();

        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Milagros");
        arrayList.add("Camelia");
        arrayList.add("Maria");
        arrayList.add("Lin");
        System.out.println("Изначальный список");
        System.out.println(arrayList);

        Predicate<String> p1 = (element)->element.length()<6;
        Predicate<String> p2 = (element)->element.contains("M");

        System.out.println("Список имен соответствующих комбинации предикаторв:");
        filteredNames(arrayList,p1.or(p2));

        System.out.println("Список имен соответствующих обратному условию:");
        filteredNames(arrayList,p1.negate());


    }

    static void filteredNames(ArrayList<String> names,Predicate<String> predicate){
        for (String name:names){
            if(predicate.test(name))
                System.out.println(name);
        }
    }
}
