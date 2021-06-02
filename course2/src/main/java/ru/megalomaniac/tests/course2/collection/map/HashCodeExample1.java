package ru.megalomaniac.tests.course2.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student st1=new Student("Britney","Spears",3);
        Student st2=new Student("Ashley","Simpson",2);
        Student st3=new Student("Elizabeth","Olsen",1);

        Student st4 = new Student("Britney","Spears",3);

        map.put(st1,2.5);
        map.put(st2,3.5);
        map.put(st3,5.0);

        System.out.println(map);
        boolean result = map.containsKey(st4);
        System.out.println("Is map contains Britney Spears = "+result);

        System.out.println("Hash code of Britney Spears = "+st1.hashCode());

        System.out.println("Entry set:");
        for(Map.Entry<Student,Double> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //load factor - если у нас количество заполненных элементов достигнет (0.75*16)=12, размер массива
        // увеличится вдвое. Все элементы хеш мапа будут перехешированы( поменяются индексы у нод.
        // чем больше load factor тем больше экономится памяти но замедляется время доступа.
        // 0.75 золотая середина.
        // initial capacity - исходный размер массива нод.
        Map<Integer,String> map2 = new HashMap<Integer,String>(16,0.75F);

        // Как может потеряться элемент в хэш мап?
        // А вот так:
        System.out.println(st1.name+" присутствует в map? "+map.containsKey(st1));
        System.out.println("Меняем курс на 5й у "+st1.name);
        st1.course=5;
        System.out.println("А теперь "+st1.name+" присутствует в map? "+map.containsKey(st1));
        // меняя значение поля в ключе - мы так же меняем и хеш код ключа, т.к. значения полей участвуют
        // в получении хеш кода (если конечно хеш код не определен через константу)
        // Поэтому ключ в HashMap должен быть immutable - все поля в ключе и сам класс объявляем как final

    }
}

class Student implements Comparable<Student>{
    String name;
    String sureName;
    int course;

    public Student(String name, String sureName, int course) {
        this.name = name;
        this.sureName = sureName;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(sureName, student.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                name  + ' '+
                sureName +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if(result==0)
            result=this.sureName.compareTo(o.sureName);
        return result;
    }
}
