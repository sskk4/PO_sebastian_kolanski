package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {


        System.out.println("PODAJ LICZBE: ");

        Scanner input = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            try {
                userInput = input.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("BŁĄD! PODAJ POPRAWNA LICZBE");
                input.next();
            }
        }

        if (userInput < 0) {
            throw new IllegalArgumentException(String.format("PIERWIASTEK Z %.4f NIE ISTNIEJE", userInput));
        }

        System.out.print(String.format("PIERWIASTEK Z %.4f == %.4f.", userInput, Math.sqrt(userInput)));
    }

}
