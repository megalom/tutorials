package ru.megalomaniac.tests.course2.streams;

import ru.megalomaniac.tests.course2.lambda.old.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamMinMax {
    public static void main(String[] args) {
        Student student1 = new Student("Jhon", 'm', 22, 3, 6.3);
        Student student2 = new Student("Ashley", 'f', 21, 2, 5.3);
        Student student3 = new Student("Britney", 'f', 23, 4, 9.1);
        Student student4 = new Student("Mark", 'm', 20, 1, 7.3);
        Student student5 = new Student("Madonna", 'f', 40, 4, 8.3);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Student min = students.stream().min((o1, o2) -> o1.getAge()-o2.getAge()).get();
        System.out.println(min);
        Student max = students.stream().max((o1, o2) -> o1.getAge()-o2.getAge()).get();
        System.out.println(max);
    }
}
