package ru.megalomaniac.tests.course2.lambda.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Britney","Ashley","Madonna","Elizabeth","Maria");
        // method 1
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("other method:");
        // method 2
        list.forEach(str-> System.out.println(str));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(4);
        list2.add(2);

        list2.forEach(element->{
            System.out.println("Element: "+element);
            element*=2;
            System.out.println("Element * 2: "+element);
        });
    }
}
