package ru.megalomaniac.tests.course2.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;


// Function <T,R> - T это входной параметр, R тип возвращаемого значения

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Jhon", 'm', 22, 3, 6.3);
        Student student2 = new Student("Ashley", 'f', 21, 2, 5.3);
        Student student3 = new Student("Britney", 'f', 23, 4, 9.1);
        Student student4 = new Student("Mark", 'm', 20, 1, 7.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudentInfo studentInfo = new StudentInfo();
        double result = avgOfSomething(students,(st) -> st.avgGrade);
        System.out.println("Average student grade is "+result);
        result = avgOfSomething(students,(st) -> (double)st.course);
        System.out.println("Average student course is "+result);
    }

    private static Double avgOfSomething(List<Student> list, Function<Student, Double> f) {
        Double result = 0.0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
