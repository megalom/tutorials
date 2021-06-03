package ru.megalomaniac.tests.course2.collection.set;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {
    // TreeSet сравнивает элементы не по equals а по compareTo
    // Если Equals возвращает true то тогда compareTo должна возвращать 0

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course;
            }
        });
        Student st1 = new Student("Britney",4);
        Student st2 = new Student("Ashley",2);
        Student st3 = new Student("Madonna",5);
        Student st4 = new Student("Elizabeth",1);
        Student st5 = new Student("Monica",6);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println(treeSet);

        Student st6 = new Student("Maria", 3);
        Student st7 = new Student("Carol", 5);
        System.out.println(treeSet.headSet(st6));
        System.out.println(treeSet.tailSet(st6));
        System.out.println(treeSet.subSet(st6,st7));

    }
}
class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;

    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return name+" on course "+course;
    }
}
