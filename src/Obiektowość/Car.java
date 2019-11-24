package Obiektowość;

public class Car {

    //Atrybuty
    private String model ;
    private String marka ;
    private Integer rokProdukcji ;
    private Integer wiek;
    private Integer predkosc;


    //Konstruktor
    public Car (String model, String marka, Integer rokProdukcji) {
        this.model = model;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.wiek = this.obliczWiek ();
        this.predkosc = 0;
    }

    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - this.rokProdukcji;
    }

    public Integer przyspiesz (Integer zmiana) {
        this.predkosc += zmiana;
        System.out.println ("Twoja aktualna prędkość to " + this.predkosc);
        return this.predkosc;
    }

    public void opiszAuto () {
        System.out.println ("Oto " + this.marka + " " + this.model);
        if(this.wiek < 5) {
            System.out.println ("Nowe auto, prawie nie używane");
        }else if (this.wiek <= 20) {
            System.out.println ("Trochę już jeździ, ale jeszcze działa");
        }else {
            System.out.println ("Nadaje się tylko na złom");
        }
    }

}
