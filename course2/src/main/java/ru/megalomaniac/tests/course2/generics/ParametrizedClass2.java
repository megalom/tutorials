package ru.megalomaniac.tests.course2.generics;

import java.util.Arrays;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<Integer,String>[] pair= new Pair[3];;
        pair[0]=new Pair<>(1,"carpet");
        pair[1]=new Pair<>(2,"dumbbell");
        pair[2]=new Pair<>(3,"spoon");

        System.out.println("pair:");
        System.out.println(Arrays.toString(pair));


    }
}

class Pair<V1,V2>{
    private V1 value1;
    private V2 value2;

    Pair(){

    }

    Pair(V1 v1,V2 v2){
        this.value1=v1;
        this.value2=v2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "id=" + value1 +
                ", name=" + value2 +
                '}';
    }
}
