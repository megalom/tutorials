package ru.megalomaniac.tests.course2.lambda.old;

import java.util.ArrayList;

public class StudentTest {
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

        StudentInfo info = new StudentInfo();
        /*
        System.out.println("Students with grade less than 8");
        info.printStudentsOverGrade(students,8);
        System.out.println("Students with age less than 22");
        info.printStudentsUnderAge(students,22);
        System.out.println("Mixed condition");
        info.printStudentsMixCondition(students,19,'m',8);*/

        // не очень хорошее решение т.к. в CheckOverGrade  условие отбора явно задано
        info.testStudents(students,new CheckOverGrade());
        System.out.println("========================>");

        // Используем анонимный класс
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age<30;
            }
        });
        System.out.println("========================>");
        // Используем лямбда выражение
        info.testStudents(students,(Student s)->{return s.age<23;});
        System.out.println("========================>");
        info.testStudents(students,(Student s)->{return s.avgGrade>7;});
        System.out.println("========================>");
        info.testStudents(students,(Student s)->{return s.avgGrade>7&&s.sex=='f';});
        // Еще короче
        System.out.println("========================>");
        info.testStudents(students,(s)->s.age>21&&s.sex=='f');





    }
}
