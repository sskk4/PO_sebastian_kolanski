package Punkt;

class Prostokat {
    double wys = 0, podst = 0;

    Prostokat(double wys, double podst) {
        this.wys = wys;
        this.podst = podst;
    }

    public double getPowierzchnia()
    {
        return podst*wys;
    }
}