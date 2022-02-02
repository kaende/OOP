package Transakcije;

public class KreditniZahtev extends ZahtevZaTransfer{
    private Datum datumPocetkaOtplate;
    private Datum datumKarajaOtplate;

    public KreditniZahtev(Racun primalac, Racun uplatilac, Datum datum, double iznos, Datum datumPocetkaOtplate, Datum datumKarajaOtplate) {
        super(primalac, uplatilac, datum, iznos);
        this.datumPocetkaOtplate = datumPocetkaOtplate;
        this.datumKarajaOtplate = datumKarajaOtplate;
    }

    public Datum getDatumPocetkaOtplate() {
        return datumPocetkaOtplate;
    }

    public void setDatumPocetkaOtplate(Datum datumPocetkaOtplate) {
        this.datumPocetkaOtplate = datumPocetkaOtplate;
    }

    public Datum getDatumKarajaOtplate() {
        return datumKarajaOtplate;
    }

    public void setDatumKarajaOtplate(Datum datumKarajaOtplate) {
        this.datumKarajaOtplate = datumKarajaOtplate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("kredit (");
        sb.append(id);
        sb.append(") ");
        sb.append(datum.toString());
        sb.append(" [");
        sb.append(iznos);
        sb.append("] ");
        sb.append("Datum pocetka otplate: ");
        sb.append(datumPocetkaOtplate);
        sb.append(" Datum kraja otplate: ");
        sb.append(datumPocetkaOtplate);

        return sb.toString();
    }

    public boolean izvrsiZahtev() {
        boolean skinuto = uplatilac.skini(iznos);

        if(skinuto){
            double iznosManjeKamata = iznos - 5 * iznos / 100;
            primalac.uplati(iznosManjeKamata);
            return true;
        }
        else{
            return false;
        }
    }
}
