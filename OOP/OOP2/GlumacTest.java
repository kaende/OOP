package Klase.Glumac;

import java.util.Scanner;

public class GlumacTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime, prezime, pol, godine, vasu ocenu i da li je glumac ili glumica iz Srbije: ");
        String ime = sc.next(), prezime = sc.next(), pol = sc.next();
        char polSlovo = pol.charAt(0);
        int godine = sc.nextInt();
        double ocena = sc.nextDouble();
        boolean izSrbije = sc.nextBoolean();

        Glumac actor = new Glumac(ime, prezime, polSlovo, godine, ocena, izSrbije);
        Glumac actress = new Glumac("Eva", "Ras", 'z', 80, 10.0, true);

        System.out.println(actor);
        System.out.println(actress);
    }
}
