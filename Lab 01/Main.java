package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double a,b,c;

        System.out.print("Podaj a -->");
        a = input.nextDouble();

        System.out.print("Podaj b -->");
        b = input.nextDouble();

        System.out.print("Podaj c -->");
        c = input.nextDouble();

        delta(a,b,c);
        sortowanie(a, b, c);
deszcz();
samochod();
        dzialanie();
    }


    public static void sortowanie(double a, double b, double c) {

        if (a > b && a > c && b>c) {  System.out.println(a+" "+b+" "+c);}
        else if (a > b && a > c && c>b) {System.out.println(a+" "+c+" "+b);}

        else if (b > a && b > c && a>c) {System.out.println(b+" "+a+" "+c);}
        else if (b > a && b > c && c>a) {System.out.println(b+" "+c+" "+a);}

        else if (c > a && c > b && a>b ) {System.out.println(c+" "+a+" "+b);}
        else if (c > a && c > b && b>a) {System.out.println(c+" "+b+" "+a);}
    }

    public static void delta(double a, double b, double c) {

        System.out.print("Rownanie:    " + a + "x^2 + " + b + "x + "+ c + " = 0 ");

        double delta = b*b-(4*a*c);

        if(delta<0)
        {
            System.out.println("   Rownanie nie ma rozwiazan");
        }
        else if(delta>0)
        {
            System.out.println("   Rownanie ma dwa rozwiazania:"+((-b)-(Math.sqrt(delta))/(2*a))+"  i  "+((-b)+(Math.sqrt(delta))/(2*a)));
        }
        else if(delta==0)
        {
            System.out.println("    Rownanie ma jedno rozwiazanie"+((-b)/(2*a)));
        }



    }

    public static void deszcz()
    {

        
        System.out.println("Czy pada deszcz? [t/n] -->");

        Scanner input = new Scanner(System.in);

        String c= input.next();
        System.out.println("Czy jest autobus na przystanku? [t/n] -->");
        String b=input.next();



        if(c.equals("t") && b.equals("t"))
        {
            System.out.println("Weź parasol, dostaniesz się na uczelnie");
        }
        if(c.equals("t") && b.equals("n"))
        {
            System.out.println("Nie dostaniesz się na uczelnie");
        }
        if(c.equals("n") && b.equals("t"))
        {
            System.out.println("Dostaniesz się na uczelnie, miłego dnia i pięknej pogody");
        }
        if(c.equals("n") && b.equals("n"))
        {
            System.out.println("Nie dostaniesz się na uczelnie");
        }

    }

    public static void samochod()
    {


        System.out.println("Jest znizka na samochod? [t/n] -->");

        Scanner input = new Scanner(System.in);

        String c= input.next();
        System.out.println("Otrzymales premie? [t/n] -->");
        String b=input.next();



        if(c.equals("t") && b.equals("t"))
        {
            System.out.println("Mozesz kupic samochod");
        }
        if(c.equals("t") && b.equals("n"))
        {
            System.out.println("Zakup samochód trzeba odłożyć" +
                    " na później..., Zniżki na samochód nie ma");
        }
        if(c.equals("n") && b.equals("t"))
        {
            System.out.println("Zakup samochód trzeba odłożyć" +
                    " na później..., Zniżki na samochód nie ma");
        }
        if(c.equals("n") && b.equals("n"))
        {
            System.out.println("Nie kupisz samochodu");
        }

    }

    public static void dzialanie()
    {


        System.out.println("Wybierz działanie: 1. mnozenie 2.dzielenie 3. reszta z dzielenia 4. dodawanie 5. odejmowanie");

        Scanner input = new Scanner(System.in);

        int c= input.nextInt();
        System.out.println("Podaj a ---> ");
        double a= input.nextDouble();
        System.out.println("Podaj b ---> ");
        double b= input.nextDouble();

        if(c==1)
        {
            System.out.println(a+" * "+b+" = "+(a*b));
        }
        if(c==2)
        {
            System.out.println(a+" / "+b+" = "+(a/b));
        }
        if(c==3)
        {
            System.out.println(a+" % "+b+" = "+(a%b));
        }
        if(c==5)
        {
            System.out.println(a+" - "+b+" = "+(a-b));
        }
        if(c==4)
        {
            System.out.println(a+" + "+b+" = "+(a+b));
        }

    }
}



/*
    public static double a(double x)
    {
        if(a<0)
        {return 2x}

        else if(a>0)
        {return 0}

        else if(a==0)
        {return -3x}
    }

    public static double b(double x){

        else if (b > 1 || b == 1)
        {return x * x}

        else if (b < 1)
        {return x}
    }

    public static double c(double x){
        else if(c==2)
        {return 8}

        else if(c<2)
        {return x-4}

        else if(c>2)
        {return x+2}
    }
*/
