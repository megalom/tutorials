package ru.megalomaniac.tests.course2.streams;

import ru.megalomaniac.tests.course2.lambda.old.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamSkip {
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

        System.out.println("Всего");
        students.stream().filter(e->e.getAge()>21).forEach(System.out::println);
        System.out.println("Ограничимся 2мя первыми");
        students.stream().filter(e->e.getAge()>21).limit(2).forEach(System.out::println);
        System.out.println("Пропустим 2");
        students.stream().filter(e->e.getAge()>21).skip(2).forEach(System.out::println);

    }
}
