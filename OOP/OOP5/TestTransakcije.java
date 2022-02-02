package Transakcije;

public class TestTransakcije {
    public static void main(String[] args) {
        try {
            Datum d1 = new Datum(1, 12, 2021);
            Datum d2 = new Datum(2, 12, 2021);
            Datum d3 = new Datum(3, 12, 2021);
            Datum d4 = new Datum(4, 12, 2021);

            Racun r1 = new Racun(1000, 100);
            Racun r2 = new Racun(2000, 200);
            Racun r3 = new Racun(3000, 300);

            Banka b = new Banka("Banka", r1);

            KreditniZahtev kz1 = new KreditniZahtev(r1, r2, d1, 900, d2, d3);
            Uplatnica u1 = new Uplatnica(r3, r1, d4, 300, "Uplata racuna");

            b.dodajZahtev(kz1);
            b.dodajZahtev(u1);

            b.izvrsiZahtev();
            b.izvrsiZahtev();

            System.out.println(b);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
