package ru.megalomaniac.tests.course2.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*list.add("OK");
        list.add(1);
        list.add(new StringBuilder());*/

        list.add("Hello!");
        list.add("Bye!");
        list.add("OK!");
        list.add("Cancel!");
        //list.add(1);

        for(Object o : list){
            System.out.println(o + " length "+((String)o).length());
        }
    }
}
