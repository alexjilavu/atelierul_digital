package com.company;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void fileRead()
    {
        try {
            FileReader inputStream = new FileReader("in.bin");
            FileWriter outputStream = new FileWriter("out.bin");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println("EROARE");
        }
    }

    public static void buffRead()
    {
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("in.bin"));
            BufferedWriter outputStream = new BufferedWriter(new FileWriter("out.bin"));
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println("EROARE");
        }
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        //fileRead();
        buffRead();
        Instant stop = Instant.now();
        Duration duration = Duration.between(start, stop);
        System.out.println(duration);
    }
}
