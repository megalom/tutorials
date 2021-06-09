package ru.megalomaniac.tests.course2.streams;

import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3);
        long count = stream.count();
        System.out.println(count);
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(stream2.distinct().count());
    }
}
