package ru.megalomaniac.tests.course2.ionio;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) {
        dataStreamExample("/home/megalom/data.bin");
    }

    public static void dataStreamExample(String filename){
        try(DataOutputStream outputStream =
                    new DataOutputStream(new FileOutputStream(filename));
            DataInputStream inputStream =
                    new DataInputStream(new FileInputStream(filename))
        ){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(300_000_001);
            outputStream.writeFloat(1.5F);
            outputStream.writeDouble(4.0000005);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
