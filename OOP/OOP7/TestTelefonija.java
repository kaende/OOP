package Telefonija;

public class TestTelefonija {
    public static void main(String[] args) {
        try{
            Broj b1 = new Broj("381", "63", "1234567", false);
            Broj b2 = new Broj("381", "63", "4567123", false);

            Korisnik k1 = new Korisnik("Stefan", "Markovic", b1);
            Korisnik k2 = new Korisnik("Stevan", "Marovic", b2);

            k1.posaljiPoruku("e gde si?", b2);
            k2.posaljiPoruku("evo me, ti?", b1);

            k1.posaljiPoruku("tu sam, zovem te uskoro", b2);
            k2.posaljiPoruku("vazi", b1);

            k1.pozovi(212, b2);

            System.out.println(k1);
            System.out.println(k2);

            System.out.println("Cena svih usluga korisnika k1: " + k1.cenaSvihUsluga());
            System.out.println("Cena svih usluga korisnika k2: " + k2.cenaSvihUsluga());

        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
