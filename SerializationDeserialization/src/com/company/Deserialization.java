package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
    public static void main(String[] args) {
        // write your code here

        try {
            FileInputStream fileInputStream=new FileInputStream("output.txt");
            ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
            Book book1=(Book) inputStream.readObject();
            Book book2=(Book) inputStream.readObject();
            Book book4=(Book) inputStream.readObject();
            Book book3=(Book) inputStream.readObject();
            Book book5=(Book) inputStream.readObject();
            System.out.println(book1.getBookName());
            System.out.println(book2.getBookName());
            System.out.println(book3.getBookName());
            System.out.println(book4.getBookName());
            System.out.println(book5.getBookName());
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
