package ru.megalomaniac.tests.course2.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5,8,2,4,3);
        Optional<Integer> o = stream.reduce((accumulator, element)->accumulator*element);
        if(o.isPresent())
            System.out.println("result = "+o.get());
        else
            System.out.println("result is not present");
        Stream<Integer> stream2 = Stream.of(5,8,2,4,3);
        int result2 = stream2.reduce(10,(accumulator,element)->accumulator+element);
        System.out.println(result2);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Britney");
        arrayList.add("Ashley");
        arrayList.add("Madonna");
        arrayList.add("Elizabeth");
        arrayList.add("Maria");

        String result3 = arrayList.stream().reduce((a,e)->a+" "+e).get();
        System.out.println(result3);
    }
}
