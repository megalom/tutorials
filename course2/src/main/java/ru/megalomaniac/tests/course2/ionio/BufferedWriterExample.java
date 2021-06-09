package ru.megalomaniac.tests.course2.ionio;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        copyFileChar();
        copyFileLine();
    }

    public static void copyFileChar(){
        try(BufferedReader reader= new BufferedReader(
                new FileReader("/home/megalom/oop.txt"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("/home/megalom/oop_copy.txt"))
        ){
            int character;
            while((character=reader.read())!=-1){
                writer.write(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
    }

    public static void copyFileLine(){
        try(BufferedReader reader= new BufferedReader(
                new FileReader("/home/megalom/oop.txt"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("/home/megalom/oop_copy2.txt"))
        ){
            String line;
            while((line=reader.readLine())!=null){
                writer.write(line);
                writer.write('\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
    }
}
