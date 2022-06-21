package com.company;

public class Zadanie3 {

    class NieprawidlowyAdresException extends Exception {
        public NieprawidlowyAdresException(String message) {
            super(message);
        }
    }
    public class Adres {

        private String ulica;
        private int numerDomu;
        private String kodPocztowy;
        private String miasto;

        public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto)


                throws NieprawidlowyAdresException {
            String blad = "";
            if (ulica == null) {
                blad += "ULICA NIE MOŻE BYĆ NULLEM. ";
            }
            if (numerDomu <= 0) {
                blad += "NUMER DOMU > 0. ";
            }
            if (kodPocztowy == null) {
                blad += "KOD POCZTOWY NIE MOŻE BYĆ NULLEM. ";
            }
            if (miasto == null) {
                blad += "MIASTO NIE MOŻE BYĆ NULLEM.";
            }
            if (!blad.equals("")) {
                throw new NieprawidlowyAdresException(blad);
            }
            this.ulica = ulica;
            this.numerDomu = numerDomu;
            this.kodPocztowy = kodPocztowy;
            this.miasto = miasto;
        }

    }

}
