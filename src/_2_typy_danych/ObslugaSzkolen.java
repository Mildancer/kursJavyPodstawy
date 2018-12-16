package _2_typy_danych;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie( "Szkolenie Java",  10, new BigDecimal ("1000"),  LocalDate.of(2018, Month.DECEMBER, 15));

        szkolenieJava.wyswietl();

        Adres adresSzkoleniaJava = new Adres("Stawowa", "40-100", "Katowice");
        adresSzkoleniaJava.wyswietl2();

        /*
        double przychodJava = szkolenieJava.obliczPrzychodNetto();      // inny sposob  zapisania przychodu brutto i  odwolania
        System.out.println("Przychod netto: " + obliczPrzychodBrutto);

         */

        Szkolenie szkoleniePython = new Szkolenie("Szkolenie Python", 13, new BigDecimal("1200"), LocalDate.of(2018, Month.DECEMBER, 15));

       szkoleniePython.wyswietl();

        Adres adresSzkoleniaPython = new Adres("Buraccka", "30-100", "Sosnowiec");
        adresSzkoleniaPython.wyswietl2();


    }











}
