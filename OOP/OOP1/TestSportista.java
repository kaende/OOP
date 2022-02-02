package Klase.Sport;

import javax.swing.*;
import java.util.Scanner;

public class TestSportista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite ime, prezime, klub i broj na dresu prvog sportiste: ");
        String ime = sc.next();
        String prezime = sc.next();
        String sport = sc.next();
        String klub = sc.next();
        int broj = sc.nextInt();


        Sportista igrac1 = new Sportista(ime, prezime, klub, sport, broj);
        Sportista igrac2 = new Sportista("Michael", "Jordan", "Bulls", "Kosarka", 23);
        Sportista igrac3 = new Sportista("Diego", "Maradona", "Napoli", "Fudbal", 10);
        System.out.println(igrac1.getIme() + " " + igrac1.getPrezime() + " sa brojem: " + igrac1.getBroj()
        + " igra za ekipu " + igrac1.getKlub() + " njegov sport je " + igrac1.getSport());
        System.out.println(igrac2.getIme() + " " + igrac2.getPrezime() + " sa brojem: " + igrac2.getBroj()
                + " igra za ekipu " + igrac2.getKlub() + " njegov sport je " + igrac2.getSport());
        System.out.println(igrac3.getIme() + " " + igrac3.getPrezime() + " sa brojem: " + igrac3.getBroj()
                + " igra za ekipu " + igrac3.getKlub() + " njegov sport je " + igrac3.getSport());

        igrac1.setKlub("Partizan");
        igrac1.setBroj(55);
        String noviKlub = igrac1.getIme() + " " + igrac1.getPrezime();
        System.out.println(noviKlub + " je presao u " + igrac1.getKlub() + " i sada nosi broj " + igrac1.getBroj());
    }
}
