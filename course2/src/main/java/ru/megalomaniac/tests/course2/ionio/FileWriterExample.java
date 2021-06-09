package ru.megalomaniac.tests.course2.ionio;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "Объе́ктно-ориенти́рованное программи́рование (ООП) — методология программирования," +
                " основанная на представлении программы в виде совокупности объектов," +
                " каждый из которых является экземпляром определённого класса," +
                " а классы образуют иерархию наследования.\n";

        writeToFile("/home/megalom/oop.txt", text);
        System.out.println("Done!");

        try {
            System.out.println(readFormFile("/home/megalom/oop.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done!");
    }

    // Writer перезаписывает файл
    public static void writeToFile(String filename, String text) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filename);
            for (int i = 0; i < text.length(); i++)
                writer.write(text.charAt(i));
            writer.append(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readFormFile(String filename) throws IOException{
        String result = "";
        try (FileReader fileReader = new FileReader(filename)) {
            int character = 0;
            while (character != -1) {
                character = fileReader.read();
                result = result.concat(Character.toString((char) character));
            }

            return result;
        }
    }
}
