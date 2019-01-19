package _7_petle;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_parkomat2 {
    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        BigDecimal godziny = 0;
        BigDecimal dozaplaty = 0;
        BigDecimal monety = 0;
        BigDecimal kwotawplacona = 0;
        System.out.println("Podaj ilosc godzin parkowania: ");
        godziny = wejscie.nextBigDecimal();

        dozaplaty = godziny * 3;

        System.out.println("Zapłać: " + dozaplaty + "zł");


        while (kwotawplacona < dozaplaty) {
            System.out.println("Wrzuc monety");
            monety = wejscie.nextBigDecimal();

            kwotawplacona += monety;

            System.out.println("bierzaca kwota " + kwotawplacona);

        }
        if (kwotawplacona > dozaplaty) {
            System.out.println("wydaje reszte: " + (kwotawplacona - dozaplaty));
        }
        else System.out.println("Dziekujemy");


    }

}


/* Program:
 * pyta "Ile godzina będziesz parkować?",
 * oblicza kwotę do zapłaty zakładając, że jedna godzina kosztuje 3zł
 * w pętli prosi o wrzucenie kolejnej monety
 * aż klient wrzuci wymaganą kwotę (wrzucenie monety = wczytanie liczby Scannerem)
 * na końcu... pomyślcie sami
 */
