package ru.megalomaniac.tests.course2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample01 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Britney");
        map1.put(2300,"Ashley");
        map1.put(500,"Madonna");
        map1.put(900,"Elizabeth");
        map1.put(200,"Christina");
        map1.putIfAbsent(1000,"Maria"); // если ключ уже есть такой, то значение не добавляется
        System.out.println("initial map:");
        System.out.println(map1);
        System.out.println("getting element by key 200");
        System.out.println(map1.get(200));
        System.out.println("removing by key 500:");
        map1.remove(500);
        System.out.println(map1);
        System.out.println("map contains value Elizabeth: "+map1.containsValue("Elizabeth"));
        System.out.println("map contains key 150: "+map1.containsKey(150));
        System.out.println("map set of keys: "+map1.keySet());
        System.out.println("map collection of values"+map1.values());


    }

}
