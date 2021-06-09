package ru.megalomaniac.tests.course2.ionio.serialization.prog1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample3 {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Britney",
                "music",
                35,
                1000,
                new Car("lada","silver"));
        try(ObjectOutputStream out= new ObjectOutputStream(
                new FileOutputStream("/home/megalom/employee.bin")
        )) {
            out.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
