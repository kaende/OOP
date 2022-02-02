package Telefonija;

public abstract class Usluga {
    protected Broj brojOd;
    protected Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public void setBrojOd(Broj brojOd) {
        this.brojOd = brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    public void setBrojKa(Broj brojKa) {
        this.brojKa = brojKa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(brojOd.toString());
        sb.append(" -> ");
        sb.append(brojKa.toString());

        return sb.toString();
    }

    public abstract double cenaUsluge();
}
