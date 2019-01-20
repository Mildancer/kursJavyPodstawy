package _7_petle;

import java.util.Optional;
import java.util.OptionalInt;

public class _7_5_FunkcjeNaTablicach {

    static int suma(int[] tablica) {
        int wynik = 0;

        for (int liczba : tablica) {
            wynik += liczba;
        }

        return wynik;
    }

    static int suma_inaczej(int[] tablica) {
        int wynik = 0;

        for (int i = 0; i < tablica.length; i++) {
            wynik += tablica[i];
        }
        return wynik;
    }
/*
    static int suma_stream(int[] tablica) {
        return IntStream.of(tablica).sum();
    }
    */


    static int sumaParzystych(int[] tablica) {
        int wynik = 0;

        for (int liczba : tablica) {

            if ((liczba % 2) == 0) {      //liczba%2 jest podzielne przez 2
                wynik += liczba;
            }
        }

        return wynik;


    }

    //wyszukiwanie najwyzszej wartosci

    static int max(int[] tablica) {

        int wynik = Integer.MIN_VALUE; // najmniejsza wartosc integera w tabli (bo  int wynik = 0; to nazwyzsza wartosc bedzie 0 w tabeli z wartosciami ujemnymi

        for (int x : tablica) {    //x jest elementem w tabeli

            if (x > wynik) {
                wynik = x;            //w wynik wpisz x
            }
        }
        return wynik;
    }

    // alternatywne rozwiazanie
    static Integer maxx(int[] tablica) { // Integer( a nie int) bo moze zwrocic nulla. Klasyczne podejscie do obslugi nulla. null oznacza brak wyniku

        if(tablica.length ==0){ // zabezpieczenie, gdy tabela nie ma elementow
            return null;
        }

        int wynik = tablica[0]; // wartosc istniejaca na pierwszym miejscu w tabli (bo  int wynik = 0; to nazwyzsza wartosc bedzie 0 w tabeli z wartosciami ujemnymi

        for (int x : tablica) {    //x jest elementem w tabeli

            if (x > wynik) {
                wynik = x;            //w wynik wpisz x
            }
        }
        return wynik;
    }

    // Nowoczesne podejscie do obsulugi nulli
    //uzywamy klasy Optional
    // pudelko, w ktorym moze byc wartosc lub moze jej nie byc
    static OptionalInt maxxx(int[] tablica) {
        if(tablica.length ==0){ // zabezpieczenie, gdy tabela nie ma elementow
            return OptionalInt.empty();
        }

        int wynik = tablica[0]; // wartosc istniejaca na pierwszym miejscu w tabli (bo  int wynik = 0; to nazwyzsza wartosc bedzie 0 w tabeli z wartosciami ujemnymi

        for (int x : tablica) {    //x jest elementem w tabeli

            if (x > wynik) {
                wynik = x;            //w wynik wpisz x
            }
        }
        return OptionalInt.of(wynik); // pudełko zawierające wynik

    }




    // Dla wygody maina testującego umieszczam w tym samym pliku
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};
        int[] c = {-10,-20,-5,- 10};
        int[] e = {};


        System.out.println("suma a : " + suma(a)); // 90
        System.out.println("suma b : " + suma(b)); // 5
        System.out.println();
        System.out.println("suma a : " + suma_inaczej(a)); // 90
        System.out.println("suma b : " + suma_inaczej(b)); // 5
        System.out.println();

        System.out.println("suma parzystych a : " + sumaParzystych(a)); // 70
        System.out.println("suma parzystych b : " + sumaParzystych(b)); // 0
        System.out.println();
        System.out.println("Najwyzsza wartoscia w tabeli a jest " + max(a)); // 30
        System.out.println("Najwyzsza wartoscia w tabeli b jest " + max(b)); // 20
        System.out.println("Najwyzsza wartoscia w tabeli c jest " + max(c)); // -5
        System.out.println("Najwyzsza wartoscia w tabeli e jest " + max(e)); //  nie ma wartosci wwyjdzie cos dziwnego

        System.out.println();
        System.out.println("Najwyzsza wartoscia w tabeli a jest " + maxx(a)); //
        System.out.println("Najwyzsza wartoscia w tabeli b  jest " + maxx(b)); //
        System.out.println("Najwyzsza wartoscia w tabeli c jest " + maxx(c)); //
        System.out.println("Najwyzsza wartoscia w tabeli e jest " + maxx(e)); //

        System.out.println();
        System.out.println("Najwyzsza wartoscia w tabeli a jest " + maxxx(a)); //
        System.out.println("Najwyzsza wartoscia w tabeli b  jest " + maxxx(b)); //
        System.out.println("Najwyzsza wartoscia w tabeli c jest " + maxxx(c)); //
        System.out.println("Najwyzsza wartoscia w tabeli e jest " + maxxx(e)); //

        //inny sposob na domysslna wartosc

        Integer wynik = maxx(e);
        if (wynik != null ){
            System.out.println("Wynik e wynosi " + wynik);
        }
        else {
            System.out.println("Wyniku nie ma");
        }
        OptionalInt opt = maxxx(e);
        if(opt.isPresent()) {
            System.out.println("Wynik wynosi " + opt.getAsInt());
        } else {
            System.out.println("Wyniku nie ma");
        }
        // inny sposób domyślna wartość (jeśli tablica pusta, przyjmij wynik 0)
        System.out.println(opt.orElse(0));
    }





    }



