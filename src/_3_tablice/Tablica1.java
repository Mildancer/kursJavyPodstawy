package _3_tablice;

public class Tablica1 {

    public static void main(String[] args) {

        // tablice indeksowane od 0np 0-6 (dla n= 7)

        int[] tablica = new int[8]; // zeby byla tablica musi byc []

        System.out.println("Dlugosctablicy: " + tablica.length);  //lenght -jaka ma dlugoscc

        System.out.println("Element 3. tablicy: " + tablica[2]); // [2] wskazuje ktory integer

        // System.out.println("Element nieistniejacy tablicy: " + tablica[8]); pojawia sie wyjatek, bo dla niego tablica 8 elementowana ma maks [7]

        tablica[1] = 183;

        System.out.println("Element 3. tablicy: " + tablica[1]);

        int[] tablicaWypelniona = {178, 185, 189, 177}; // tworzenie tablicy 4elementowej, wypelnionej elementami

        // interacje

        /* petle

                     START       WARUNEK STOP               KROK-inkrementacja zmiennej-zwieksze wartosci o 1
        1.petla for (int i = 0; i< tablicaWypelniona.lenght; i++)
        sout

        i++ ==  i=i+1 == i+=1 --postinkrementacja

        i-- posttdekrementacja
        --i dekrementacjca

        // preinkrementacja: ++i

         */

        System.out.println("Tablica rosnaca");
        for (int i = 0; i < tablicaWypelniona.length; i++) {
            System.out.println(tablicaWypelniona[i]);
        }
        System.out.println("");
        System.out.println("Tablica malejaca");

        for (int i = tablicaWypelniona.length - 1; i >= 0; i--) {
            System.out.println(tablicaWypelniona[i]);

        }

        //wyswietlanie co 2 elementu

        System.out.println("Tabli co 2gi element");

        for (int i = 0; i < tablicaWypelniona.length; i = i + 2)
        {
            System.out.println(tablicaWypelniona[i]);

        }




    }
}



