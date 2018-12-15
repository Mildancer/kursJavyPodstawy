package _2_typy_danych;

public class Adres {
    String ulica;
    String kodPocztowy;
    String miasto;


    public Adres() {
    }


    public Adres(String ulica, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public void wyswietl2() {
        System.out.println("ulica: " + this.ulica);
        System.out.println("kod_pocztowy: " + this.kodPocztowy);
        System.out.println("miasto: " + this.miasto);
        System.out.println();


    }
}