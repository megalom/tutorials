package ru.megalomaniac.tests.course2.collection.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Britney",'f',39,3,8.3);
        Student st2 = new Student("Elizabeth",'f',35,1,7.9);
        Student st3 = new Student("Mark",'m',45,2,9.1);
        Student st4 = new Student("Walter",'m',51,4,7.1);
        Student st5 = new Student("Karl",'m',47,3,6.7);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);
        Student st6 = new Student("Karl",'m',47,3,6.7);
        studentList.remove(st6);
        System.out.println(studentList);

    }
}

class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}'+"\n";
    }
}
