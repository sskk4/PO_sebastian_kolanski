package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static double liczba;

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        double a,b;
        System.out.print("Podaj pierwszą liczbe --> ");
        a = input.nextDouble();
        System.out.print("Podaj druga liczbe --> ");
        b = input.nextDouble();

        trojkat(a,b);
        pierwiastek(a);
        potega(a);
        podzielna(a);
        parzysta(a);
        licz(a,b);
	    ja();
    }

    public static void ja() {
        String imie = "Sebastian";
        int wiek = 21;
        System.out.print(imie +" "+ wiek);

    }

    public static void licz(double a, double b) {

        System.out.println("SUMA:= "+(a+b));
        System.out.println("ROZNICA:= "+(a-b));
        System.out.println("ILOCZYN:= "+(a*b));

    }

    public static void parzysta(double a)
    {
        if(a%2==0)
        {
            System.out.println("~ LICZBA "+a+" JEST PARZYSTA ~");
        }
        else
        {
            System.out.println("~ LICZBA "+a+" JEST NIEPARZYSTA ~");
        }


    }

    public static void podzielna(double a)
    {
        if(a%5==0 && a%3==0)
        {
            System.out.println("~ LICZBA "+a+" JEST PODZIELNA PRZEZ 5 I 3 ~");
    }
        else
        {
            System.out.println("~ LICZBA "+a+" NIE JEST PODZIELNA PRZEZ 5 I 3 ~");
        }
}

public static void potega(double a)
{
    System.out.println(a+"^3 = "+(Math.pow(a,3)));

}

    public static void pierwiastek(double a)
    {
        System.out.println(" Pierwiastek z "+a+" = "+(Math.sqrt(a)));
    }

    public static void trojkat(double a,double b)
    {
double liczba1,liczba2,liczba3;

        liczba1= Math.floor(Math.random() * (b - a)) + a;

        liczba2=  Math.floor(Math.random() * (b - a)) + a;
        liczba3=  Math.floor(Math.random() * (b - a)) + a;

        System.out.println("Z liczb: {"+liczba1+" , "+liczba2+" , "+liczba3+" }");

        if(liczba1+liczba2<liczba3 || liczba1+liczba3<liczba2 || liczba2+liczba3<liczba1 || liczba1==liczba2 && liczba2==liczba3)
        {
            System.out.println("Mozna zbudowac trojkat");
        }
        else {
            System.out.println("Nie mozna zbudowac trojkata");
        }
        }

    }



