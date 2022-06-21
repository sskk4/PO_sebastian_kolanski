package com.company;
import java.io.*;
import java.util.Scanner;


public class Zadanie3 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);


        System.out.println("PODAJ SCIEZKE DO PLIKU: ");
        String filePath = input.nextLine();

            System.out.println("PODAJ DZIEN URODZENIA: ");
            int dzienurodzenia = input.nextInt();

            System.out.println("PODAJ MIESIAC URODZENIA: ");
            int miesiacurodzenia = input.nextInt();

            System.out.println("PODAJ ROK URODZENIA: ");
            int rokurodzenia = input.nextInt();

        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream(filePath));
            output.writeInt(dzienurodzenia);
            output.writeInt(miesiacurodzenia);
            output.writeInt(rokurodzenia);
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
