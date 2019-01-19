package _6_dziwne_zachowania;

import java.util.Scanner;

public class PomnozDwieLiczby_INT {

    public static void main(String[] args) {
        Scanner wejscie =new Scanner(System.in);
        /* wejscie.useLocale(Locale.US); - dzieki temu w scanerze podawanie . zamiast , */
        System.out.println("Podaj dwie liczby: ");
        int arg1 = wejscie.nextInt();
        int arg2 = wejscie.nextInt();  // w kodzie Javy podawanie doubli z kropka _ jezeli podajemy przez konsole to trzeba podac z przecinkiem,

        int wynik = arg1 * arg2;
        System.out.println(wynik);

        System.out.println("Max int wynosi " +Integer.MAX_VALUE);
        // jak obliczyc  w sposob bezpieczny?

        try {
            int wynik2 = Math.multiplyExact(arg1, arg2);
            System.out.println("wynik mnozenia bezpiecznego: " + wynik2);
        } catch (ArithmeticException e) {
            e.printStackTrace();  // try cath  ctrl+alt+t
            System.out.println("wynik nie miesci sie w zakresie");
        } //catch exception = znaczy wylap wyjatki

    }
}
