package ru.megalomaniac.tests.course2.lambda.predicate;

import ru.megalomaniac.tests.course2.lambda.predicate.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


// Пример без использования лябда выражений

public class StudentInfo {
    public static void main(String[] args) {
        Student student1= new Student("Jhon",'m',22,3,6.3);
        Student student2= new Student("Ashley",'f',21,2,5.3);
        Student student3= new Student("Britney",'f',23,4,9.1);
        Student student4= new Student("Mark",'m',20,1,7.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudent(students, (p)->{return p.avgGrade>7;});


    }
    void testStudent(List<Student> students, Predicate<Student> p){
        for(Student student:students)
            if(p.test(student))
                System.out.println(student);
    }
}
