package com.company;

public class Main {

    public static void main(String[] args) {

       sumasrednia();
       tablica();
wariancja();


    }

    public static void sumasrednia() {

        int suma = 0, srednia = 0;
        int[] tab= {1,2,3,4,5};
        for(int i=0;i<tab.length;i++)
        {
            suma += tab[i];
        }

        for(int liczba: tab)
        {
            srednia=srednia+liczba;
        }
        srednia=srednia/tab.length;

        System.out.println("Suma = "+suma);
        System.out.println("Srednia = "+srednia);

    }

    public static void tablica(){

        boolean[] tab = new boolean[20];
        for(int i=0;i<20;i++)
        {
            if(i%2==0)
            { tab[i]=true;}
            else
            {tab[i]=false;}

            System.out.println(tab[i]);
        }
    }

    public static void wariancja(){
        double[] tab = {2, 3, 12, 4, 12, -2};
double srednia=0,wariancja2=0;

        for(int i=0;i<tab.length;i++)
        {
            srednia=srednia+tab[i];
        }
        srednia=srednia/tab.length;

        for(int j=0;j<tab.length;j++)
        {
            wariancja2+=(Math.pow((tab[j]-srednia), 2));
        }
        wariancja2=wariancja2/tab.length;
        System.out.println("wariancja z pomiarow = "+wariancja2);
    }
}
