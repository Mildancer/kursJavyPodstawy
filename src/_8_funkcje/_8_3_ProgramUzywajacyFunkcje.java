package _8_funkcje;

import java.util.Scanner;

public class _8_3_ProgramUzywajacyFunkcje {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
       // wejscie.useLocale(Locale.US);

        System.out.println("Podaj liczbę: ");
        double x = wejscie.nextDouble();

        double poleKwadratu = _8_2_FunkcjeGeometryczne.poleKwadratu(x);
        System.out.println("Pole kwadratu: " + poleKwadratu);

        double poleKola = _8_2_FunkcjeGeometryczne.poleKola(x);
        System.out.println("Pole koła: " + poleKola);

        System.out.println("A teraz wylosuję sobie liczbę");
        double losowa = Math.random() * 100;  // wartość od 0 do 100
        System.out.println("losowa: " + losowa);

        System.out.println("Pole kwadratu losowej: "
                + _8_2_FunkcjeGeometryczne.poleKwadratu(losowa));

        System.out.println("Pole koła losowa: "
                + _8_2_FunkcjeGeometryczne.poleKola(losowa));

    }
}
