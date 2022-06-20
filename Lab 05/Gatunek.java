package com.company;

public class Gatunek {

    static String nazwarodzaju="Cardinalis";
    static String nazwagatunku="Cardinalis cardinalis";
    static int liczbachromosomow2n=38;
    static int podstliczbachromosomow=46;
    static String opis=" Preferuje obszary zalesione, ogrody, zarosla i bagna. ";

    static public void wyswietlnazwe()
    {
        System.out.println("NAZWA RODZAJU: "+ nazwarodzaju + "     NAZWA GATUNKU: "+ nazwagatunku);
    }

    static public void wyswietldane()
    {
        wyswietlnazwe();
        wyswietlilechromosomow();
        System.out.println("OPIS: "+opis);
    }

    static public void wyswietlilechromosomow()
    {
        System.out.println("LICZBA CHROMOSOMOW: "+liczbachromosomow2n);
    }

    static public void sklonuj()
    {

    }

}
