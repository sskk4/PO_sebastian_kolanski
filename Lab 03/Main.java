package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        losowanie();
        ciag();
        dziesiecliczb();
        sredniaocen();

    }

    public static void sredniaocen()
    {
        System.out.println("~  ZAD 1  ~");

        double n,ocena,suma=0,srednia;
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj n  ---> ");
        n = input.nextDouble();

        int i=0;
        while(i<n)
        {
            System.out.print("Podaj ocene  ---> ");
            ocena = input.nextDouble();
            suma=suma+ocena;
            i++;
        }
        srednia = suma/n;
        System.out.println("Srednia ocen :   "+srednia);

    }

    public static void dziesiecliczb()
    {
        System.out.println("~ ZAD 2 ~");

        Scanner input = new Scanner(System.in);
        double liczba,dodatnie=0,ujemne=0,suma=0;
        int i=0;
        while(i<10)
        {
            System.out.print("Podaj liczbe nr "+ (i+1) +" ---> ");
            liczba = input.nextDouble();
            suma=suma+liczba;
            if(liczba>0) {dodatnie++;}
            if(liczba<0) {ujemne++;}
            i++;

        }
        System.out.println("SUMA  :=   "+suma);
        System.out.println("LICZB UJEMNYCH := "+ujemne+" LICZB DODATNICH := "+dodatnie);
    }

    public static void ciag()
    {
        System.out.println("~ ZAD 3 ~");

        double n,suma=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj ilosc wyrazow ciagu  ---> ");
        n = input.nextDouble();
        for(double i=1;i<n+1;i++)
        {
            if(n>0 && i%2==0)
            {suma=suma+i;
                System.out.println(i +" PARZYSTA");}
            else{System.out.println(i+" ~ Nie jest parzysta ~");}
        }
        System.out.println("SUMA LICZB PARZYSTYCH  :=  "+ suma);

    }

    public static void losowanie()
    {
        System.out.println("~ ZAD 4 ~");

        double n,suma=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj ilosc wyrazow ciagu  ---> ");
        n = input.nextInt();

        Random rand = new Random();

        for(int i=1;i<n+1;i++)
        {
            int random = rand.nextInt(45)-10;
            if(n>0 && random%2==0)
            {suma=suma+random;
                System.out.println(random +" PARZYSTA");}
            else{System.out.println(random+" ~ Nie jest parzysta ~");}
        }

        System.out.println("SUMA LICZB PARZYSTYCH  :=  "+ suma);


    }

// 5.Napisz  program,  który  odpowie  na  pytanie,  czy  podane  przez  użytkownika  słowo  jest palindromem.
// Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.
public static boolean Palindrom(String tekst){
    for (int i = 0; i < tekst.length()/2; i++) {
        char znak = tekst.charAt(i);
        char przeciwnyZnak = tekst.charAt(tekst.length() - 1 - i);

        if (znak != przeciwnyZnak) return false;
    }
    return true;
}

    public static boolean Palindrom(long liczba){
        return Palindrom(Long.toString(liczba));
    }
}