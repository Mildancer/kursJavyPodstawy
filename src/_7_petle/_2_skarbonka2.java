package _7_petle;

import java.util.Scanner;

public class _2_skarbonka2 {
    public static void main(String[] args) {

        /* while(warunek)
        {instrukcje...}
        podobny do if  bo jesli warune prawdziwy to wykonaj instrukcje, ale jezeli nadal warunek prawdziwy to wykonaj ponownie

        */

        Scanner wejscie = new Scanner(System.in);
        /* Jaś dostal pusta skarbon i chce zebrac 100zl. program w petli bedzie
        prosil o wrzucenie pieniazka tak dlugo do skarbonki, az zbierrze sie 100zl
        */

        int skarbonka = 0; // na poczatku w skarbonce jest 0

        while (skarbonka < 100) {  // jesli mniejsza to pytaj o pieniwazek
            System.out.println("Wrzuc monete");
            int wrzutka = wejscie.nextInt();
            skarbonka += wrzutka; // to samo co:  skarbonka = skarbonka + wrzutka;
            System.out.println("bierzaca wartosc skarbonki " + skarbonka);
        }

        System.out.println("Udało sie zebrac: " + skarbonka);
    }

}
