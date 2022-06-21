package com.company;
import java.io.*;
import java.util.Scanner;


public class Zadanie2 {

    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    BufferedReader inputFile = null;
    int ilelini = 0;
    String linia;

    System.out.println("PODAJ SCIEZKE DO PLIKU: ");
    try {
        inputFile = new BufferedReader(new FileReader(input.next()));
        System.out.println("PODAJ ZAWARTOSC PLIKU: ");

        while (true) {
            linia = inputFile.readLine();
            if (linia == null) {
                break;
            }
            ilelini++;
            System.out.println(linia);
        }
    }
    finally {
        if (inputFile != null) {
            inputFile.close();
        }
    }

    System.out.println("PLIK MA " + ilelini + " LINII.");
}
}
