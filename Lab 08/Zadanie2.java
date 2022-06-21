package com.company;

public class Zadanie2 {

    class BlednaWartoscDlaSilniException extends Exception {
        public BlednaWartoscDlaSilniException(String message) {
            super(message);
        }
    }


    public class SilniaBlad {
        public static void main(String[] args) {
            try {
                System.out.println("Silnia  3 = " + silnia(3));
                System.out.println("Silnia -3 = " + silnia(-3));
            } catch (BlednaWartoscDlaSilniException e) {
                System.out.println("BŁĄD!!!: " + e.getMessage());
            }
        }



        public int silnia(int n)
                throws BlednaWartoscDlaSilniException {
            if (n < 0) {
                throw new BlednaWartoscDlaSilniException("NIE LICZE SLINI GDZIE n<0");
            }
            int wynik = 1;
            for (int i = 2; i <= n; i++) {
                wynik *= i;
            }
            return wynik;
        }


    }

}
