package ru.megalomaniac.tests.course2.nested.anonymous_class;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(m.doOperation(3,5));
    }
}

interface Math{
    int doOperation(int a, int b);
}
