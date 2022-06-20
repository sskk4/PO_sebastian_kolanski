package com.company;

public class Prostokat {

    static int dlugosc=10;
    static int szerokosc=20;

    public static int liczpole()
    {
        return dlugosc*szerokosc;

    }

    public static int liczobwod()
    {
        return dlugosc*2+szerokosc*2;
    }

    public static double dlugoscprzekatnej()
    {
        return Math.sqrt(dlugosc*dlugosc+szerokosc*szerokosc);
    }

}
