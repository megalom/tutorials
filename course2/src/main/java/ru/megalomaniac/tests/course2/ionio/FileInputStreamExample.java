package ru.megalomaniac.tests.course2.ionio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        copy("/home/megalom/oop.txt","/home/megalom/oop_copy3.txt");
    }
    public static void copy(String src, String dest){
        try(
                FileInputStream inputStream = new FileInputStream(src);
                FileOutputStream fileOutputStream = new FileOutputStream(dest)
                ){
            int i;
            while((i=inputStream.read())!=-1){
                fileOutputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("done.");
    }
}

