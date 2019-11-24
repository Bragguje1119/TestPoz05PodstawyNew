package Obiektowość;

public class Human {

    //Atrybuty klasy
    private String name ;
    private String surname ;
    private Integer birthYear ;
    private Integer age;



    //Konstruktor
    public Human(String name, String surname, Integer year, Integer birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek ();



    }

    public Human(String name, String surname, Integer birthYear) {
    }

    //metody klasy
    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - this.birthYear;
    }

    public void przedstawSie () {
        System.out.println ("Hej, Nazywam się" + this.name + " " + this.surname);
        System.out.println ("Mam " + this.age + " lat.");
    }

    //Metody settery i gettery
    //Getter

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Setter

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
        this.age = this.obliczWiek ();
    }

    //Słówko static - pozwala dostać się do tej funkcji bez inicjalizacji obiektu nie mozemy operwać w nich na
    // żadnych atrybutach/metodach niestetycznych

    public static void opiszKlasę () {
        System.out.println ("Klasa Human oblicza wiek i umożliwia przedstawienie się obiektu");
    }

    //metody klasy
    private Integer obliczWiek;
}
