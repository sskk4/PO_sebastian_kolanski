
package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Main
{


    public static void TylkoPelnoletniUczestnik(Uczestnik uczestnik,LinkedList<Uczestnik> uczestnicy)
    {
        if(uczestnik.pelnoletni())uczestnicy.add(uczestnik);
    }

    public static void DodajUczestnika(Uczestnik uczestnik,LinkedList<Uczestnik> uczestnicy)
    {
        uczestnicy.add(uczestnik);
    }


    public static void main(String[] args)
    {

        LinkedList<Uczestnik> uczestnicy=new LinkedList<Uczestnik>();

        TylkoPelnoletniUczestnik(new Uczestnik(1,"Kamil",30),uczestnicy);
        TylkoPelnoletniUczestnik(new Uczestnik(2,"Damian",25),uczestnicy);
        TylkoPelnoletniUczestnik(new Uczestnik(3,"Damian",15),uczestnicy);


        Jakasklasa[] jakaslista=new Jakasklasa[3];
        jakaslista[0]=new Jakasklasa();
        jakaslista[1]=new Jakasklasa();

        LinkedList<Jakasklasa> jakasklasaList =new LinkedList<Jakasklasa>();

        for (int i = 0; i < 2; i++)
        {
            jakasklasaList.add(jakaslista[i]);
        }

        LinkedList<Jakasklasa> rzeczyKilka= (LinkedList<Jakasklasa>) jakasklasaList.subList(1,2);
        jakasklasaList.removeAll(rzeczyKilka);

        LinkedList<Integer> n1=new LinkedList<Integer>();
        n1.add(1);
        n1.add(2);


        LinkedList<Integer> n2=new LinkedList<Integer>();
        ListIterator<Integer> nnn = n1.listIterator();
        while (nnn.hasNext()) {
            n2.addFirst(nnn.next());
        }

    }

}

class Uczestnik
{

    int ID,wiek;
    String imie;

    public Uczestnik(int ID, String imie, int wiek)
    {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public boolean pelnoletni()
    {
        if(wiek>18)return true;
        else return false;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(ID, imie, wiek);
    }
}

class Jakasklasa
{
    String imie;
}
