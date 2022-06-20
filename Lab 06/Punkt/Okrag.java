package Punkt;

public class Okrag {
    Punkt srodek;
    double promien;

    public double getPowierzchnia()
    {
        return Math.PI*Math.pow(promien,2);
    }
    public double getSrednica(){return 2*promien;}
    public double setPromien(double p)
    {
        this.promien=p;
    }


    public void wSrodku(Punkt p) {
        double LStrona = Math.pow((srodek.x) - (p.x), 2) + Math.pow((srodek.y) - (p.y), 2);
        double PStrona = Math.pow(promien, 2);

        if (LStrona <= PStrona)
            System.out.println("PKT: " + p.x + " " + p.y + " znajduje sie wewnątrz okregu O (" + srodek.x + " " + srodek.y);
        else System.out.println("Punkt leży poza okręgiem");
    }


}
