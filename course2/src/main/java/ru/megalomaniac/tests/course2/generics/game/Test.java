package ru.megalomaniac.tests.course2.generics.game;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Sergey", 14);
        Schoolar schoolar4 = new Schoolar("Alena", 14);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Andrey", 32);
        Employee employee2 = new Employee("Glasha", 47);

        Team<Schoolar> schoolarTeam = new Team("Dragons");
        Team<Schoolar> schoolarTeam2 = new Team("Wisdom");
        Team<Student> studentTeam = new Team("Forward");
        Team<Employee> employeeTeam = new Team("Workers");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);


    }


}
