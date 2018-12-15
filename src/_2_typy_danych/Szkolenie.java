package _2_typy_danych;

import java.time.LocalDate;

public class Szkolenie {
    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;

//1.tworzenie nowego obiektu

    //kontruktor bezparametryczny- lista paramtrow w () pusta

    public Szkolenie(){
        System.out.println("Wykonal sie konstruktor bezparametryczny");  // dziala przy wywolaniu nowego obiektu
    }

    //kontruktor parametryczny -

    public Szkolenie(String nazwa, int liczbaUczestnikow, double cena, LocalDate data){
        System.out.println("Wykonal sie konstruktor parametryczny");  // dziala przy wywolaniu nowego obiektu
        this.nazwa = nazwa; // konstruktor przypisuje swoja  do nazwy w fukcji -- wiadomo,ze nazwa odwoluje sie do nazwy  z kontruktora (pierwsza nazwa to nazwa funckji, druga konstruktora
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
    }

    // przeciazenie nazwy fukcji

//2.wypisanie  informacji  o obiekcie

}
