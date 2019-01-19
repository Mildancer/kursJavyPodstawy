package _5_moje_zadania_domowe;

import java.util.Scanner;


public class _2_obliczanie_BMI {


    public static void main(String[] args) {

        double wzrost;
        double waga;

        double bmi;

        System.out.println("Podaj wzrost w cm (np 180cm): ");
        Scanner in = new Scanner(System.in);
        // Double.valueOf(in.nextLine());

        wzrost = Double.valueOf(in.nextLine());

        System.out.println("Wzrost to: " + wzrost);

        System.out.println("Podaj wage w kg: ");

        waga = Double.valueOf(in.nextLine());

        System.out.println("Waga to: " + waga);

        bmi = waga / ((wzrost / 100) * (wzrost / 100));

        System.out.println("BMI to " + bmi);

        if (bmi < 16) {
            System.out.println("yygłodzenie");

        } else if ((16.0 <= bmi) && (bmi < 17.0)) {
            System.out.println("wychudzenie");
        } else if ((17.0 <= bmi) && (bmi < 18.50)) {
            System.out.println("niedowaga");
        } else if ((18.50 <= bmi) && (bmi < 25.0)) {
            System.out.println("wartość prawidłową");
        } else if ((25 <= bmi) && (bmi < 30.0)) {
            System.out.println("nadwagę");
        } else if ((30 <= bmi) && (bmi < 35.0)) {
            System.out.println("I stopień otyłości");
        } else if ((35 <= bmi) && (bmi < 40.0)) {
            System.out.println("II stopień otyłości (otyłość kliniczna)");
        } else {
            System.out.println("III stopień otyłości (otyłość skrajna)");

        }

    }

/*
< 16,0 – wygłodzenie
16,0–16,99 – wychudzenie
17,0–18,49 – niedowagę
18,5–24,99 – wartość prawidłową
25,0–29,99 – nadwagę
30,0–34,99 – I stopień otyłości
35,0–39,99 – II stopień otyłości (otyłość kliniczna)
≥ 40,0 – III stopień otyłości (otyłość skrajna)
 */


}
