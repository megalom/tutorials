package ru.megalomaniac.tests.course2.generics;

import java.util.ArrayList;
import java.util.List;

public class SubtypingTest1 {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list1 = new ArrayList<>();
    }
}

class X{

}

class Y extends X{

}
