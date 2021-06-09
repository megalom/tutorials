package ru.megalomaniac.tests.course2.ionio.serialization.prog1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Britney");
        employees.add("Ashley");
        employees.add("Madonna");

        try(
                ObjectOutputStream objectOutputStream =
                        new ObjectOutputStream(new FileOutputStream("/home/megalom/obj.bin"))
                ) {
            objectOutputStream.writeObject(employees);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
