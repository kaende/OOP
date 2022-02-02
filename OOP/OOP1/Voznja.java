package Klase.Vozilo;

import Klase.Vozilo.Automobili;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite marku, model i serijski broj prvog automobila: ");
            String ime = sc.next();
            String tip = sc.next();
            int sb = sc.nextInt();

            System.out.println("Unesite marku, model i serijski broj drugog automobila: ");
            String ime2 = sc.next();
            String tip2 = sc.next();
            int sb2 = sc.nextInt();

            System.out.println("Upisite ime vlasnika prvog i ime vlasnika drugog automobila: ");
            String vlasnik = sc.next();
            String vlasnik1 = sc.next();

            Automobili auto = new Automobili(ime, tip, sb);
            Automobili auto2 = new Automobili(ime2, tip2, sb2);

            auto.setVlasnik(vlasnik);
            auto2.setVlasnik(vlasnik1);

            System.out.println("Vozilo je marke " + auto.getMarka() + ", model " + auto.getModel());
            System.out.println("Serijskog broja " + auto.getSerijskiBroj() + ", ime vlanika: " + auto.getVlasnik());
            System.out.println();
            System.out.println("Vozilo je marke " + auto2.getMarka() + ", model " + auto2.getModel());
            System.out.println("Serijskog broja " + auto2.getSerijskiBroj() + ", ime vlasnika: " + auto2.getVlasnik());
            System.out.println();

            String novaMarka = auto.getMarka();
            novaMarka = "Fiat";

            String noviModel = auto.getModel(); // get model iz auto
            noviModel = "Panda"; // get model auto ... audi ... panda

            int noviSb = auto.getSerijskiBroj();
            noviSb = auto.getSerijskiBroj() + 123;

            System.out.println("Novo vozilo je marke " + novaMarka + ", model " + noviModel);
            System.out.println("Serijskog broja " + noviSb + " GTI" + "\n");

    }
}


