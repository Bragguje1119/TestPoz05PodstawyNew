import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static  String zwrocImie( Integer case1) {
        String imie = " ";
        switch (case1) {
            case 1: imie = "Kasia"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default: imie = "NoName";
        }

        return imie;
    }

    public static void przedstawSie (String imie) {
        System.out.println("Moje imie to " + imie);
    }
    //Wpisujemu Main
    //Funkcja egzekucyjne
    public static void main(String[] args) {
       String imie = zwrocImie(5);
       przedstawSie(imie);
        Object case1;
        imie = zwrocImie (1);
        przedstawSie(imie);
        przedstawSie (zwrocImie (10));


        System.out.println("Mój pierwszy program");
        //Zmienne: defincja typu (string) nazwa zmiennej (napis) + opcjonanie przydzielenie wartości
        String napis1 = "Barbara Górna";
        //Boolean - typ logiczny, zwaraca true lub false
        Boolean isTomek = napis1.contains("Tomek");
        System.out.print(isTomek);
        //Integer - typ numeryczny liczb całkowitych
        //Long - liczba całkowita, dużo dłuższy
        Integer liczba1 = 2;
        Long liczba2 = Long.valueOf(1302);
        //Typ prosty, Integer to klasa wrappująca typ prosty int (daje metody ułatwiające pracę z danym typem)
        //Float - typ numeryczny zmiennoprzecinkowy
        //Float ulamek1 = 10.155;
        Double ulamek2 = 10.5;
        //Kolekcje
        //Lista = zbior elementow w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());

        //HashMap - słownik trzymajacy pary klucz-wartość
        HashMap <String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put ("Tomek", 5);
        System.out.println(mapa1.toString());
        //CTRL + SHIFT + F10 - odpalenie aktualnje konfiguracji
        //Pair - słownik, slownik tylko jedna para klucz - wartość
        Pair<String, Integer> pair = new Pair<>("Barbara Górna", 1);
        String napis2 = pair.getKey();
        napis2 += pair.getValue() .toString();
        System.out.println(napis2);
        //Pętle
        //Petla for
        //Warunke początkowy (wartość początkowa licznika;
        //Warunek końcowy (wartość końcowa licznika;
        //modyfikator licznika i++ oznacza że będzie większe o 1 po przejściu pętli
        for(Integer i=0; i<=5; i++) {
            System.out.println("Wartosc licznika: " + i.toString());
        }

        Integer i = 0;
        while (i<5) {
            System.out.println("Jestem w while po raz" + i.toString());
            i++;



            }
        //Break to specjalne słowo, które pozwala zakończyć działanie pętli
        while(true) {
            i++;
            if (i.equals(7))
                continue;
            System.out.print(" " + i.toString());
            if(i.equals(10))
                break;
        }
        //Pętla do do zawsze wykona się z conajmniej jedną iteracją
        do {
                System.out.println("Jestem w do while");
                i++;
        }while (i<10);

        //Pętla for each
        for (String el: lista1) {
            System.out.println("Element listy: " + el);

            //Pętla for each na mapie #TODO
            //for (String el: mapa1) ()

            //Instrukcje warunkowe
            //Intrukcje if... else if... else...

        }
        if(lista1.size() == 2) {
            System.out.println("Z tym warunkiem nigdy się nie wypisze");
        }else {
            System.out.println("Jestem w instrukcji else");
        }

        if (lista1.size() < 1){
            System.out.println("Nie wykonam się");
        }else if (lista1.size() == 2) {
            System.out.println("Ja się nie wykonam");
        }else {
            System.out.println("Ja się już nie wykonam, bo warunke jest spełniony");
        }

        //Instrukcja warunkowa switch case

        i=5;
        String message = "Moje imię to ";
        switch (i) {
            case 2: message += "Kasia"; break;
            case 5: message += "Tomek"; break;
            case 8: message += "Dawid"; break;
        }

        System.out.println(message);



    }



}


