import Dziedziczenie.Man;
import Dziedziczenie.Woman;
import Obiektowość.Car;
import Obiektowość.Human;

public class Obiektowosc {

    public static void main (String [] args) {

        Human.opiszKlasę ();

        Integer birthYear;
        Human czlowiek1 = new Human ( " Kasia",  "Nowakowska", birthYear, 1991);
        //Metoda przeddstaw się jest dostępna bo jest public
        czlowiek1.przedstawSie ();

        //Atrybut name oraz funkcja oblicz wiek nie są dostępne poza klasą Human, bo są private
        //czlowiek1.name;
        //czlowiek1.obliczWiek ();

        Human czlowiek2 = new Human (" Robert", "Kowalski", birthYear, 1985);
        czlowiek2.przedstawSie ();

        Human czlowiek3 = new Human (" Gosia", "Majewska", birthYear, 1969);
        czlowiek3.przedstawSie ();

        System.out.println (czlowiek3.getName () + " " + czlowiek3.getSurname ());
        czlowiek3.setBirthYear (1975);
        czlowiek3.przedstawSie ();

        //2 Obiekty klasy car
        Car opel = new Car ("astra", "opel", 2006);
        opel.przyspiesz (  60 );
        opel.przyspiesz ( 20 );
        opel.opiszAuto ();

        Car bmw = new Car ("m3", "bmw", 2016);
        bmw.przyspiesz ( 152 );
        bmw.opiszAuto ();

        //Obiekt klasy Woman
        Woman kobieta1 = new Woman ("Kasia", "Kowalska", 2007);
        kobieta1.przedstawSie ();
        kobieta1.setBirthYear (2009);
        kobieta1.getName ();

        //Obiekt klasy Man
        Man mężczyzna1 = new Man ("Stefan", "Wiśniewski", 1990);
        mężczyzna1.setwaga (78);
        mężczyzna1.ocensile ();
        mężczyzna1.przedstawSie ();





    }
}
