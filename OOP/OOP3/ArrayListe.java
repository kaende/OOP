package Klase.Liste;

import java.util.ArrayList;

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList<String> voznjaBajsa = new ArrayList<String>();
        voznjaBajsa.add("Bicikl");
        voznjaBajsa.add("Kaciga");
        voznjaBajsa.add("Rukavice");
        voznjaBajsa.add("Ranac");
        voznjaBajsa.add("Flasica sa vodom");
        voznjaBajsa.add("Snikers");
        voznjaBajsa.add("Jabuka");
        voznjaBajsa.add("Naocare za sunce");
        voznjaBajsa.add("Slusalice");
        voznjaBajsa.add("Lanac");

        System.out.println(voznjaBajsa.get(2));
        voznjaBajsa.set(0, "Helikopter");
        voznjaBajsa.remove(4);

        System.out.println("Za ugodnu i sigurnu voznju treba vam " + voznjaBajsa.size() + " stvari" + "\n");

        for(int i = 0; i < voznjaBajsa.size(); i++){
            System.out.println(voznjaBajsa.get(i));
        }

        for(String items : voznjaBajsa){
            System.out.println(items);
        }
    }
}
