package Transakcije;

public class Racun {
    private double stanje;
    private double dozvoljeniMinus;

    public Racun(double stanje, double dozvoljeniMinus) {
        this.stanje = stanje;
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public double getStanje() {
        return stanje;
    }

    public double getDozvoljeniMinus() {
        return dozvoljeniMinus;
    }

    public void setDozvoljeniMinus(double dozvoljeniMinus) {
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public void uplati(double suma){
        stanje += suma;
    }

    public boolean skini(double suma){
        if(dozvoljeniMinus + stanje > suma){
            stanje = stanje - suma;
            return true;
        }
        else{
            return false;
        }
    }
}
