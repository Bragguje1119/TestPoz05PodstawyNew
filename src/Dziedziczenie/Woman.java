package Dziedziczenie;

import Obiektowość.Human;

public class Woman extends Human {

    private String plec;

    public Woman(String name, String surname, Integer birthYear) {
        super (name, surname, birthYear, birthYear);
        this.plec = "kobietą";
    }

    @Override
    public void przedstawSie () {
        super.przedstawSie ();
        System.out.println ("Jestem " + this.plec);
    }
}
