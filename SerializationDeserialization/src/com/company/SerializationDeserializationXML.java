package com.company;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializationDeserializationXML {

    public static void main(String[] args) throws IOException {

        Book book = new Book(1, "Fareler ve İnsanlar", "SEL YAYINCILIK ", "John Steinbeck ", "Roman");
        serilization(book);
        System.out.println("Deserialization Sonrası" + deserialization().toString());
    }

    public static void serilization(Book book) throws IOException {
        FileOutputStream fos = new FileOutputStream("serializationDeserialization.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                System.out.println("Exception: " + e.toString());
            }
        });
        encoder.writeObject(book);
        encoder.close();
        fos.close();
    }

    public static Book deserialization() throws IOException {
        FileInputStream fis = new FileInputStream("serializationDeserialization.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        decoder.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                System.out.println("Exception: " + e.toString());
            }
        });
        Book book = (Book) decoder.readObject();
        decoder.close();
        fis.close();
        return book;
    }


}
