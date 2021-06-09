package ru.megalomaniac.tests.course2.streams;

import ru.megalomaniac.tests.course2.lambda.old.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToInt {
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

        List<Integer> courses = students.stream().mapToInt(e1->e1.getCourse())
                .boxed().collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream().mapToInt(e1->e1.getCourse()).sum();
        System.out.println("sum of courses = "+sum);

        double avg = students.stream().mapToInt(e1->e1.getCourse()).average().getAsDouble();
        System.out.println("avg of courses = "+avg);

        int min = students.stream().mapToInt(e1->e1.getCourse()).min().getAsInt();
        System.out.println("min of courses = "+min);

        int max = students.stream().mapToInt(e1->e1.getCourse()).max().getAsInt();
        System.out.println("max of courses = "+max);



    }
}
