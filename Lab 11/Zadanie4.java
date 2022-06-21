package com.company;
import java.io.*;
import java.util.Scanner;


public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("PODAJ SCIEZKE DO PLIKU: ");
        String filePath = input.nextLine();
        DataInputStream inputFile = null;
        int dzien = 0;
        int miesiac = 0;
        int rok = 0;

        try {
            inputFile = new DataInputStream(new FileInputStream(filePath));
            dzien = inputFile.readInt();
            miesiac = inputFile.readInt();
            rok = inputFile.readInt();
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }

        System.out.println("DATA URODZENIA : " + dzien + "." + miesiac + "." + rok );
    }
}
