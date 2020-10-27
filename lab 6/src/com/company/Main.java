package com.company;
import java.io.*;
import java.io.FileWriter;
import java.io.FileReader;

public class Main {
            public static void main(String[] args) throws IOException {
                Reader in=null;
                Writer out=null;
                try {
                    in = new FileReader("E:\\MyFile1.txt"); // файл для чтения
                    out= new FileWriter("E:\\MyFile2.txt", true); // файл для записи

                    int oneByte; // переменная, в которую считываются данные
                    while ((oneByte = in.read()) != -1) {
                         out.write((char)oneByte); // запись с уничтожением ранее
                        // существующих данных
                        out.append((char)oneByte); // запись с добавлением данных в конец
                        System.out.print((char)oneByte);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка!!!! ");
                }
                finally{
                    in.close();
                    out.close();
                } }}



