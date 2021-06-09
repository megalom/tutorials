package ru.megalomaniac.tests.course2.ionio.serialization.prog2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample2 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        try(
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(new FileInputStream("/home/megalom/obj.bin"))
        ) {
            Object obj = objectInputStream.readObject();
            if(obj!=null){
                employees= (ArrayList<String>)obj;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
        System.out.println(employees);
    }
}
