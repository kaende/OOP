package Klase.Liste;

import java.util.ArrayList;

public class DuplaPetlja {
    public static void main(String[] args) {

        ArrayList<Integer> days = new ArrayList<Integer>(); //lista dani dodajem sedam dana
        days.add(1);
        days.add(2);
        days.add(3);
        days.add(4);
        days.add(5);
        days.add(6);
        days.add(7);

        ArrayList<Integer> week = new ArrayList<Integer>();  //lista nedelja dodajem tri nedelje
        week.add(1);
        week.add(2);
        week.add(3);

        for(int nedelja : week){
            System.out.println("Week: " + nedelja);
            for(int dan : days){
                System.out.println("Day: " + dan);
            }
        }
        //prvi ulazak u petlju, ispisuje se dan 1 i ulazi se u drugu petlju gde se ispisuje sedam dana
        //drugi ulazak u petlju, ispisuje se dan 2 i sve ostalo je isto
        //da imam 6 nedelja prvi for bi bio pokrenut 6 puta, drugi bi bio pokrenut za svaki prvi * 7

    }
}
