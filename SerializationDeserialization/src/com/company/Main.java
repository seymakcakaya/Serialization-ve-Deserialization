package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Book book1=    new Book(1,"Fareler ve İnsanlar","SEL YAYINCILIK ","John Steinbeck ","Roman");
        Book book2=      new Book(2,"Yüzyıllık Yalnızlık","CAN YAYINLARI","Gabriel Garcia Marquez ","Roman");
        Book book3=     new Book(3,"Siyah Lale","TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI ","Alexandre Dumas ","Roman");
        Book book4=     new Book(4,"Suç ve Ceza","TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI ","Fyodor Mihailoviç Dostoyevski ","Roman");
        Book book5=     new Book(5,"Sefiller","CAN YAYINLARI","Victor Hugo  ","Roman");
        try {

            FileOutputStream fileOutputStream=new FileOutputStream("output.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(book1);
            objectOutputStream.writeObject(book2);
            objectOutputStream.writeObject(book3);
            objectOutputStream.writeObject(book4);
            objectOutputStream.writeObject(book5);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
