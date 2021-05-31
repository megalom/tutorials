package ru.megalomaniac.tests.course2.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1=new Info<>("Abra cadabra!");
        System.out.println(info1);
        String s = info1.getValue();
        Info<Integer> info2=new Info<>(10);
        System.out.println(info2);
        Integer i = info2.getValue();

    }
}

class Info <T>{
    private T value;
    public Info(T value){
        this.value= value;
    }

    public T getValue(){
        return value;
    }

    public String toString(){
        return "<--"+value+"-->";
    }
}
