package _2_typy_danych;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {
    BigDecimal cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;

//1.tworzenie nowego obiektu
 // budowa kontruktora  = [public/private] [nazwa] [(lista_parametrow)]
    //kontruktor bezparametryczny- lista paramtrow w () pusta

    public Szkolenie(){
        System.out.println("Wykonal sie konstruktor bezparametryczny");  // dziala przy wywolaniu nowego obiektu
    }

    //kontruktor parametryczny -

    public Szkolenie(String nazwa, int liczbaUczestnikow, BigDecimal cena, LocalDate data){
        System.out.println("Wykonal sie konstruktor parametryczny");  // dziala przy wywolaniu nowego obiektu
        this.nazwa = nazwa; // konstruktor przypisuje swoja  do nazwy w fukcji -- wiadomo,ze nazwa odwoluje sie do nazwy  z kontruktora (pierwsza nazwa to nazwa funckji, druga konstruktora
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
    }

    // przeciazenie nazwy fukcji

//2.wypisanie  informacji  o obiekcie
    //tworzenie metody
    //[public/private] [typ zwracany] [nazwa] [(lista parametrow)]

    // public void -void-nic nie zwraca

    public void wyswietl()
    {
        System.out.println("Szkolenie: " + this.nazwa);  // this obiekt w ktorym sie znajdujemy
        System.out.printf("Cena: %.2f PLN", this.cena);
        System.out.println();
        System.out.println("liczbaUczestnikow: " +this.liczbaUczestnikow);
        System.out.println("data: " +this.data);
        System.out.println();
        System.out.println("Przychod brutto: " +this.obliczPrzychodBrutto());
       System.out.println("Przychod netto: " +this.obliczPrzychodNetto());
    }


    public  BigDecimal obliczPrzychodBrutto()
    {
       /* double przychod = this.liczbaUczestnikow * this.cena;
        return  przychod;
        */

      //wczesniej:  return this.liczbaUczestnikow * this.cena;

        return cena.multiply(BigDecimal.valueOf(liczbaUczestnikow)); // valueof przerabia  int na Bigdemical

}

  public BigDecimal obliczPrzychodNetto()
    {
        BigDecimal vat = BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT);

        return (this.obliczPrzychodBrutto().divide(vat, 2, RoundingMode.HALF_UP));

      // wczesniej  return (this.obliczPrzychodBrutto()/ (1 + StaleAplikacji.STAWKA_VAT)); //czyli dzielenie przez 1,23




    }


}

