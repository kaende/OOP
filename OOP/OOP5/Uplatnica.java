package Transakcije;

public class Uplatnica extends ZahtevZaTransfer{
    private String svrhaUplate;

    public Uplatnica(Racun primaoc, Racun uplatioc, Datum datum, double iznos, String svrhaUplate) {
        super(primaoc, uplatioc, datum, iznos);
        this.svrhaUplate = svrhaUplate;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("uplatnica (");
        sb.append(id);
        sb.append(") ");
        sb.append(datum.toString());
        sb.append(" [");
        sb.append(iznos);
        sb.append(" : ");
        sb.append(iznos/100);
        sb.append("]");
        sb.append(" Svrha: ");
        sb.append(svrhaUplate);

        return sb.toString();
    }

    public boolean izvrsiZahtev() {
        double provizija = iznos / 100;
        double iznosIProvizija = iznos + provizija;
        boolean skinuto = uplatioc.skini(iznosIProvizija);

        if(skinuto){
            primaoc.uplati(iznos);
            return true;
        }
        else{
            return false;
        }
    }
}
