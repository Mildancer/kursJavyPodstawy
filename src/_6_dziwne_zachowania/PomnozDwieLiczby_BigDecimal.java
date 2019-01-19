package _6_dziwne_zachowania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PomnozDwieLiczby_BigDecimal {

    public static void main(String[] args) {
        Scanner wejscie =new Scanner(System.in);
        /* wejscie.useLocale(Locale.US); - dzieki temu w scanerze podawanie . zamiast , */
        System.out.println("Podaj dwie liczby: ");
        BigDecimal arg1 = wejscie.nextBigDecimal();
        BigDecimal arg2 = wejscie.nextBigDecimal();  // w kodzie Javy podawanie doubli z kropka _ jezeli podajemy przez konsole to trzeba podac z przecinkiem,

        BigDecimal wynik = arg1.multiply(arg2); // taki zapis mnozenia
        System.out.println(wynik);
        wynik = wynik.setScale(2, RoundingMode.HALF_UP); //zaokraglanie do 2 miejsc po przecinku
        System.out.println(wynik);

    }
}

