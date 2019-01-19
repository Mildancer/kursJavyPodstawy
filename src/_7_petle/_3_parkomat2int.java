package _7_petle;

import java.util.Scanner;

public class _3_parkomat2int {
    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        final int CENA = 3;
        System.out.println("Ile godzin bedziesz parkowac? ");
        int godziny = wejscie.nextInt();

        int doZaplaty = godziny * CENA;
        System.out.println("Zapłać: " + doZaplaty + "zł");

        int ileWplacono = 0;

        while (ileWplacono < doZaplaty) {

            System.out.println("Wrzuc monety");
           int monety = wejscie.nextInt();

            ileWplacono += monety;

            System.out.println("bierzaca kwota " + ileWplacono);

        }
        if (ileWplacono > doZaplaty) {
            System.out.println("wydaje reszte: " + (ileWplacono - doZaplaty));
        }
        System.out.println("Dziekujemy");


    }

}


/* Program:
 * pyta "Ile godzina będziesz parkować?",
 * oblicza kwotę do zapłaty zakładając, że jedna godzina kosztuje 3zł
 * w pętli prosi o wrzucenie kolejnej monety
 * aż klient wrzuci wymaganą kwotę (wrzucenie monety = wczytanie liczby Scannerem)
 * na końcu... pomyślcie sami
 */
