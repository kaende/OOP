package Telefonija;

public class Poruka extends Usluga{
    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(brojOd.toString());
        sb.append(" -> ");
        sb.append(brojKa.toString());
        sb.append(" ");
        sb.append(tekstPoruke);

        return sb.toString();
    }

    @Override
    public double cenaUsluge() {
        if(brojOd != null && brojKa != null && !brojOd.equals(brojKa) && brojOd.getFiksni() == false
        && brojKa.getFiksni() == false){
            return 3;
        }
        else{
            return 0;
        }
    }


}
