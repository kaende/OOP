package Telefonija;

public class Poziv extends Usluga{
    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(brojOd.toString());
        sb.append(" -> ");
        sb.append(brojKa.toString());
        sb.append(" ");

        int minutni = trajanjeUSekundama / 60;
        int sekunde = trajanjeUSekundama % 60;

        sb.append(minutni);
        sb.append(":");
        sb.append(sekunde);

        return sb.toString();
    }

    public double cenaUsluge() {
        // poredjenje sa null se uvek radi sa == i !=
        if(brojOd != null && brojKa != null && !brojOd.equals(brojKa)){

            int minutni = trajanjeUSekundama / 60;
            int sekunde = trajanjeUSekundama % 60;

            if(sekunde > 0){
                minutni = minutni + 1;
            }

            double cena = 10 * minutni;
            return cena;
        }
        else{
            return 0;
        }
    }
}
