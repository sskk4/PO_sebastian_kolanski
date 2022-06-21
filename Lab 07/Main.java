package com.company;

public class Main {

    public static void main(String[] args) {

        Samolot samolot=new Samolot();
        samolot.lec();

        Poduszkowiec poduszkowiec=new Poduszkowiec();
        poduszkowiec.jedz();
        statek.plyn();


    }
}


abstract class SrodekTransportu{

}

interface Plywa{
    void plyn();
}
interface Lata{
    void lec();
}
interface Jezdzi{
    void jedz();
}

class Statek extends SrodekTransportu implements Plywa{
    public void plyn(){
        System.out.println("Plyne");
    }
}
class Samolot extends SrodekTransportu implements Lata{
    public void lec(){
        System.out.println("Lece");
    }
}
class Samochod extends SrodekTransportu implements Jezdzi{
    public void jedz(){
        System.out.println("Jade");
    }
}
class Poduszkowiec extends SrodekTransportu implements Jezdzi,Plywa{
    public void jedz(){
        System.out.println("Jade po ladzie ");
    }
    public void plyn(){
        System.out.println("Plyne po wodzie");
    }
}