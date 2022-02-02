package Klase.Vozilo;

public class Automobili {
    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;

    public Automobili(String marka1, String model1, int serijskiBroj1) {
        marka = marka1;
        model = model1;
        serijskiBroj = serijskiBroj1;
    }
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getSerijskiBroj(){
        return serijskiBroj;
    }

    public String getVlasnik(){
        return vlasnik;
    }
    public void setVlasnik(String vlasnik1){
        vlasnik = vlasnik1;
    }
}
