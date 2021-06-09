package ru.megalomaniac.tests.course2.streams;

import ru.megalomaniac.tests.course2.lambda.old.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMap {

    public static void main(String[] args) {
        Student student1= new Student("Jhon",'m',22,3,6.3);
        Student student2= new Student("Ashley",'f',21,2,5.3);
        Student student3= new Student("Britney",'f',23,4,9.1);
        Student student4= new Student("Mark",'m',20,1,7.3);
        Student student5= new Student("Madonna",'f',40,4,8.3);

        Faculty f1=new Faculty("Economics");
        Faculty f2=new Faculty("Applied mathematics");
        f1.addStudentToFaculty(student1);
        f1.addStudentToFaculty(student2);
        f2.addStudentToFaculty(student3);
        f2.addStudentToFaculty(student4);
        f2.addStudentToFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e->System.out.println(e.getName()));

    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name){
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}
