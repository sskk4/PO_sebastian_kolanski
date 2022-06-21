package com.company;
import java.io.*;
import java.util.Scanner;


public class Zadanie1 {


    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String linia;


        System.out.println("PODAJ SCIEZKE DO PLIKU: ");

        try {
            output = new FileWriter(input.nextLine());
            System.out.println("PODAJ ZAWARTOSC PLIKU: ");

            while (true) {
                linia = input.nextLine();

                if (linia.equals("-")) {
                    break;
                }
                output.write(linia);
                output.write(System.lineSeparator());
            }
        }

        finally {
            if (output != null) {
                output.close();
            }
        }
    }


}
