package Klase.Sport;

public class Sportista {
    private String ime, prezime, klub, sport;
    private int broj;

    public Sportista(String ime1, String prezime1, String klub1, String sport1, int broj1){
        ime = ime1;
        prezime = prezime1;
        sport = sport1;
        klub = klub1;
        broj = broj1;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public String getSport(){
        return sport;
    }
    public String getKlub(){
        return klub;
    }
    public int getBroj(){
        return broj;
    }
    public void setKlub(String klub1){
        klub = klub1;
    }
    public void setBroj(int broj1){
        broj = broj1;
    }
}
