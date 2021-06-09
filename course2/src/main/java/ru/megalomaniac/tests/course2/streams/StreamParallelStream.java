package ru.megalomaniac.tests.course2.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream().reduce((aDouble, aDouble2) -> aDouble+aDouble2).get();
        System.out.println("Sum result = "+sumResult);

        sumResult = list.parallelStream().reduce((aDouble, aDouble2) -> aDouble+aDouble2).get();
        System.out.println("Sum result = "+sumResult);

        double divResult = list.stream().reduce((aDouble, aDouble2) -> aDouble/aDouble2).get();
        System.out.println("Div result = "+divResult);

        // Результат будет некорректным, т.к. операции должы происходить последовательно, а
        // в параллельном потоке последовательность нарушается
        // В задачах где важен порядок эелементов ParallelStream использовать нельзя

        divResult = list.parallelStream().reduce((aDouble, aDouble2) -> aDouble/aDouble2).get();
        System.out.println("Div result = "+divResult);

    }
}
