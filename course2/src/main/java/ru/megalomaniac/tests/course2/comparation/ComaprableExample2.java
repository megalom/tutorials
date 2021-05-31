package ru.megalomaniac.tests.course2.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComaprableExample2 {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList();
        employeeList.add(new Employee(100,"Ivan","Urgant",1000));
        employeeList.add(new Employee(20,"Pavel","Volya",800));
        employeeList.add(new Employee(80,"Maria","Rasputina",945));
        employeeList.add(new Employee(30,"Ivan","Kochnev",100));

        System.out.println("Before sorting");
        System.out.println(employeeList);

        Collections.sort(employeeList);

        System.out.println("After sorting");
        System.out.println(employeeList);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surename;
    int salary;

    public Employee(int id, String name, String surename, int salary) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }

    @Override
    public int compareTo(Employee o) {
        //return this.id>o.id?1:this.id<o.id?-1:0;
        int result=name.compareTo(o.name);
        if (result==0){
            result=surename.compareTo(o.surename);
        }
        return result;
    }
}
