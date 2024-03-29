package Transakcije;

import java.util.ArrayList;

public class Banka {
    private String nazivBanke;
    private Racun racun;
    private ArrayList<ZahtevZaTransfer> nizZahteva;

    public Banka(String nazivBanke, Racun racun) {
        this.nazivBanke = nazivBanke;
        this.racun = racun;
        this.nizZahteva = new ArrayList<ZahtevZaTransfer>();
    }

    public String getNazivBanke() {
        return nazivBanke;
    }

    public Racun getRacun() {
        return racun;
    }

    public ArrayList<ZahtevZaTransfer> getNizZahteva() {
        return nizZahteva;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv banke: ");
        sb.append(nazivBanke);
        sb.append("\n");
        sb.append("Lista zahteva na cekanju:\n");
        for(ZahtevZaTransfer zt : nizZahteva){
            sb.append(zt.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public void dodajZahtev(ZahtevZaTransfer zt){
        nizZahteva.add(zt);
    }

    public void izvrsiZahtev(){
        ZahtevZaTransfer zt = nizZahteva.get(0);
        nizZahteva.remove(0);
        boolean izvrsen = zt.izvrsiZahtev();

        if(izvrsen == false){
            System.out.println("Nije moguce izvrsiti zahtev: ");
            System.out.println(zt);
        }
    }
}
