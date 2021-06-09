package ru.megalomaniac.tests.course2.streams;

import ru.megalomaniac.tests.course2.lambda.old.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollect {
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

        // группирует студентов по курсам
        Map<Integer,List<Student>> map = students.stream().map(
                element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                }
        ).collect(Collectors.groupingBy(e1 -> e1.getCourse()));

        for(Map.Entry<Integer,List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // делит на две группы студентов и записывает в Map
        Map<Boolean,List<Student>> map2 =
                students.stream().collect(Collectors.partitioningBy(e1 -> e1.getAvgGrade()>8.0F));

        for(Map.Entry<Integer,List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
