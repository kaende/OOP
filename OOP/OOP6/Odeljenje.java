package domaciSaRazmisljanjem;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj){
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u){
        System.out.println(u.ocene());
    }

    public void pogledajOcene(int i){
        System.out.println(dnevnik.get(i).ocene());
    }

    public void prosecnaOcena(Ucenik u){
        System.out.println(u.prosek());
    }

    public void prosecnaOcena(int i){
        System.out.println(dnevnik.get(i).prosek());
    }

    public double prosecnaOcenaOdeljenja(){
        double prosek = 0;
        for(Ucenik u : dnevnik){
            prosek += u.prosek();
        }
        return prosek / dnevnik.size();
    }

    public void opisnaOcena(Ucenik u){
        double prosek = u.prosek();
        if (prosek == 1)
            System.out.println("Nedovoljan");
        else if (prosek >= 4.5)
            System.out.println("Odlican");
        else if (prosek >= 3.5)
            System.out.println("Vrlo dobar");
        else if (prosek >= 2.5)
            System.out.println("Dobar");
        else
            System.out.println("Dovoljan");
    }


    public String velicinaOdeljenja(){
        if (dnevnik.size() > 25)
            return  "Veliko odeljenje";
        else if (dnevnik.size() > 15)
            return  "Srednje odeljenje";
        return  "Malo odeljenje";
    }

    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for(Ucenik u : dnevnik){
            sb.append(u.imePrezime()).append(" ima ocene:\n");
            sb.append(u.ocene());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" odeljenje ima djake:\n");
        for(Ucenik u : dnevnik)
            sb.append(u.imePrezime()).append("\n");

        return sb.toString();
    }
}
