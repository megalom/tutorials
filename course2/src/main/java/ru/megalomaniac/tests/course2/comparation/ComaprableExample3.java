package ru.megalomaniac.tests.course2.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComaprableExample3 {
    public static void main(String[] args) {
        List<Employee2> employeeList=new ArrayList();
        employeeList.add(new Employee2(100,"Ivan","Urgant",1000));
        employeeList.add(new Employee2(20,"Pavel","Volya",800));
        employeeList.add(new Employee2(80,"Maria","Rasputina",945));
        employeeList.add(new Employee2(30,"Ivan","Kochnev",100));

        System.out.println("Before sorting");
        System.out.println(employeeList);

        Collections.sort(employeeList, new idComparator());

        System.out.println("After sorting");
        System.out.println(employeeList);

        Collections.sort(employeeList, new nameComparator());

        System.out.println("After sorting");
        System.out.println(employeeList);

        Collections.sort(employeeList, new salaryComparator());

        System.out.println("After sorting");
        System.out.println(employeeList);
    }
}

class Employee2{
    int id;
    String name;
    String surename;
    int salary;

    public Employee2(int id, String name, String surename, int salary) {
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
}

class idComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.id-o2.id;
    }
}

class nameComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        int result =  o1.name.compareTo(o2.name);
        if(result==0)
            result=o1.surename.compareTo(o2.surename);
        return result;
    }
}

class salaryComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.salary-o2.salary;
    }
}
