package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie( "Szkolenie Java",  1000,  10,  LocalDate.of(2018, Month.DECEMBER, 15));

        szkolenieJava.nazwa = "Szkolenie Java";
        szkolenieJava.cena = 1000;
        szkolenieJava.liczbaUczestnikow = 10;
        szkolenieJava.data = LocalDate.of(2018, Month.DECEMBER, 15);

        System.out.println("Szkolenie: " + szkolenieJava.nazwa);
        System.out.printf("Cena: %.2f PLN", szkolenieJava.cena); // System.out.printf("\tCena: %.2f PLN\n" +szkolenieJava.cena)
        System.out.println();
        System.out.println("liczbaUczestnikow: " + szkolenieJava.liczbaUczestnikow);
        System.out.println("data: " +szkolenieJava.data);
        System.out.println();
        System.out.println();

        szkolenieJava.nazwa = "Szkolenie Python";
        szkolenieJava.cena = 1300;
        szkolenieJava.liczbaUczestnikow = 12;
        szkolenieJava.data = LocalDate.of(2018, Month.DECEMBER, 15);

        System.out.println("Szkolenie: " + szkolenieJava.nazwa);
        System.out.printf("Cena: %.2f PLN", szkolenieJava.cena);
        System.out.println();
        System.out.println("liczbaUczestnikow: " +szkolenieJava.liczbaUczestnikow);
        System.out.println("data: " +szkolenieJava.data);
    }




}
