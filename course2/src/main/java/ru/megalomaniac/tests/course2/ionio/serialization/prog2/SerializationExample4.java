package ru.megalomaniac.tests.course2.ionio.serialization.prog2;

import ru.megalomaniac.tests.course2.ionio.serialization.prog1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample4 {
    public static void main(String[] args) {
        Employee bestEmployee=null;
        try(
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(new FileInputStream("/home/megalom/employee.bin"))
        ) {
            Object obj = objectInputStream.readObject();
            if(obj!=null){
                bestEmployee= (Employee) obj;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
        System.out.println(bestEmployee);
    }
}
