package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie( "Szkolenie Java",  10,  1000,  LocalDate.of(2018, Month.DECEMBER, 15));





        szkolenieJava.wyswietl();

        Szkolenie szkoleniePython = new Szkolenie("Szkolenie Python", 13, 1200, LocalDate.of(2018, Month.DECEMBER, 15));

       szkoleniePython.wyswietl();


    }




}
