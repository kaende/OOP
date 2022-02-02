package domaciSaRazmisljanjem;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> stOcene = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 2, 4, 3, 5, 2, 2));
        Ucenik u1 = new Ucenik("Stefan", "Markovic", stOcene);

        ArrayList<Integer> mgOcene = new ArrayList<>(Arrays.asList(5, 5, 4, 5, 5, 5, 4, 4, 4, 5));
        Ucenik u2 = new Ucenik("Stevan", "Marovic");
        u2.setOcene(mgOcene);

        Odeljenje odeljenje = new Odeljenje("IV2");
        ArrayList<Ucenik> dnevnikCD = new ArrayList<>();
        odeljenje.setDnevnik(dnevnikCD);

        odeljenje.upisiUcenika(u1);
        odeljenje.upisiUcenika(u2);

        System.out.println("Stefanove ocene: ");
        odeljenje.pogledajOcene(odeljenje.getDnevnik().get(odeljenje.getDnevnik().indexOf(u1)));
        System.out.println("Stevanove ocene: ");
        odeljenje.pogledajOcene(1);

        System.out.println("Stefanov prosek: ");
        odeljenje.prosecnaOcena(0);
        System.out.println("Stefanov prosek: ");
        odeljenje.prosecnaOcena(odeljenje.getDnevnik().get(odeljenje.getDnevnik().indexOf(u1)));
        System.out.println("Stefanova opisna ocena:");
        odeljenje.opisnaOcena(u1);
        System.out.println("Prosek odeljenja: ");
        System.out.println(odeljenje.prosecnaOcenaOdeljenja());

        System.out.println("Dnevnik:");
        System.out.println(odeljenje.izlistajDnevnik());

        odeljenje.ispisiUcenika(0);
        odeljenje.ispisiUcenika(u2);
        odeljenje.upisiUcenika(u2);

        System.out.println("-----------------");
        System.out.println("Dnevnik:");
        System.out.println(odeljenje.izlistajDnevnik());

        System.out.println("Stevanov prosek:");
        odeljenje.prosecnaOcena(u2);

        System.out.println("Veilicna odeljenja:");
        System.out.println(odeljenje.velicinaOdeljenja());
        System.out.println("Odeljenje IV2");
        System.out.println(odeljenje);

    }
}
