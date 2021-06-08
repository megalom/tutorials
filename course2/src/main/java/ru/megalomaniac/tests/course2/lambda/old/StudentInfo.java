package ru.megalomaniac.tests.course2.lambda.old;

import java.util.ArrayList;


// Пример без использования лябда выражений

public class StudentInfo {
    void testStudents(ArrayList<Student> a1, StudentChecks sc){
        for(Student s:a1){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }

    void printStudentsOverGrade(ArrayList<Student> a1,double grade){
        for(Student s:a1){
            if(s.avgGrade>grade)
                System.out.println(s);
        }
    }
    void printStudentsUnderAge(ArrayList<Student> a1,int age){
        for(Student s:a1){
            if(s.age<age)
                System.out.println(s);
        }
    }

    void printStudentsMixCondition(ArrayList<Student> a1,int age,char sex,double grade){
        for(Student s:a1){
            if(s.age>age&&s.avgGrade<grade&&s.sex==sex)
                System.out.println(s);
        }
    }
}

@FunctionalInterface
interface StudentChecks{
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks{

    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}

