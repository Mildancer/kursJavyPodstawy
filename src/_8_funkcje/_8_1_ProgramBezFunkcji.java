package _8_funkcje;

import java.util.Scanner;

public class _8_1_ProgramBezFunkcji {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in); /* System.in - standardowe wejscie  -klawiatura- obiekt reprezentujacy standardowe wejscie System.in -
         mozna wprowadzadzac bajty, system.out-scanner wyjscia. scanner rozumie te wprowadzone bajty */

        //wejscie.useLocale(Locale.US); kropka na konsoli to przecinek

        System.out.println("Podaj liczbe: ");
        double x = wejscie.nextDouble();

        double poleKwadratu = x * x;
        System.out.println("Pole kwadratu: " +  poleKwadratu);

        double poleKola = Math.PI * x * x;
        System.out.println("Pole kola: " +poleKola);

        System.out.println("A teraz wylosuje sobie liczbe");
        double losowa = Math.random()* 100; //wartosc od 0 do 100
        System.out.println("liczba losowa to " +losowa);


        double poleKwadratu2 = losowa * losowa;
        System.out.println("Pole kwadratu losowej to: " + poleKwadratu2);

        double poleKola2 = Math.PI  * losowa * losowa;

        System.out.println("Pole kola losowa: " +poleKola2);
    }
}
