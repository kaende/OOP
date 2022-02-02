package Telefonija;

import java.util.ArrayList;

public class Korisnik {
    public static int NextId = 1;
    private int id;
    private String ime;
    private String prezime;
    private Broj brojOvogKorisnika;
    private ArrayList<Usluga> istorijaUsluga;

    public Korisnik(String ime, String prezime, Broj broj) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojOvogKorisnika = broj;

        this.id = NextId;
        NextId++;

        this.istorijaUsluga = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Broj getBrojOvogKorisnika() {
        return brojOvogKorisnika;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojOvogKorisnika(Broj brojOvogKorisnika) {
        this.brojOvogKorisnika = brojOvogKorisnika;
    }

    public void posaljiPoruku(String tekstPoruke, Broj brojKa){
        Poruka p = new Poruka(brojOvogKorisnika, brojKa, tekstPoruke);
        istorijaUsluga.add(p);
    }

    public void pozovi(int duzinaUSekundama, Broj brojKa){
        Poziv p = new Poziv(brojOvogKorisnika, brojKa, duzinaUSekundama);
        istorijaUsluga.add(p);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ");
        sb.append(brojOvogKorisnika.toString());
        sb.append("\n");

        sb.append("Istorija usluga:\n");
        for(Usluga u : istorijaUsluga){
            sb.append(u.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public double cenaSvihUsluga(){
        double suma = 0;
        for(Usluga u : istorijaUsluga){
            suma = suma + u.cenaUsluge();
        }

        return suma;
    }
}
