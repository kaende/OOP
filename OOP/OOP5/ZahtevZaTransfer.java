package Transakcije;

public abstract class ZahtevZaTransfer {
    private static int NextId = 1;
    protected int id;
    protected Racun primalac;
    protected Racun uplatilac;
    protected Datum datum;
    protected double iznos;

    public ZahtevZaTransfer(Racun primalac, Racun uplatilac, Datum datum, double iznos) {
        this.primaoc = primalac;
        this.uplatioc = uplatilac;
        this.datum = datum;
        this.iznos = iznos;
        this.id = NextId;
        NextId++;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public Racun getUplatilac() {
        return uplatilac;
    }

    public Datum getDatum() {
        return datum;
    }

    public double getIznos() {
        return iznos;
    }

    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public abstract boolean izvrsiZahtev();
}
