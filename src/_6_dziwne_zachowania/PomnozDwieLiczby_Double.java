package _6_dziwne_zachowania;

import java.util.Scanner;

public class PomnozDwieLiczby_Double {

    public static void main(String[] args) {
        Scanner wejscie =new Scanner(System.in);
        /* wejscie.useLocale(Locale.US); - dzieki temu w scanerze podawanie . zamiast , */
        System.out.println("Podaj dwie liczby: ");
        double arg1 = wejscie.nextDouble();
        double arg2 = wejscie.nextDouble();  // w kodzie Javy podawanie doubli z kropka _ jezeli podajemy przez konsole to trzeba podac z przecinkiem,

        double wynik = arg1 * arg2;
        System.out.println(wynik);


    }
}
