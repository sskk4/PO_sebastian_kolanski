package com.company;

public class Budynek {

    static String nazwa="UR";
    static int rokbudowy=2005;
    static int liczbapieter=4;

    public static void wyswietldane()
    {
        System.out.println("NAZWA BUDYNKU: "+ nazwa +"      ROK BUDOWY: "+rokbudowy+"       LICZBA PIETER: "+liczbapieter  );
        System.out.println("ILE LAT MA BUDYNEK: "+ilebudynekmalat());
    }

    public static int ilebudynekmalat()
    {
        int obecnyrok= 2022;
        return obecnyrok-rokbudowy;
    }
}
