package _2_typy_danych;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        System.out.print("Podaj swoje imie: "); // bez ln - nie robi entera

        Scanner wejscie = new Scanner(System.in);

        String imie = wejscie.nextLine(); // bedzie czytal znaki z klawiatury dopoki nie uzyje sie entera

        // String imie = "Milosz";

        int iloscZnakow = imie.length();


        System.out.println(imie + " ma " + iloscZnakow + " znakow");

      /*  if (warunek){

    } else  {}
    */



        if (iloscZnakow <= 6) {
            System.out.println("Krotkie slowo");
        } else {
            System.out.println("Dlugie slowo");
        }

        boolean endsWith =  imie.endsWith("a") || imie.endsWith("A");
        // boolean endsWith =  imie.toLowerCase().endsWith("a") - imie przyrownuje do malych liter


        if (imie.equalsIgnoreCase("Kuba")) {   // if (endsWith ==true) && !imie.equalsIgnoreCase("Kuba"))
            System.out.println("meskie");
        }
        else if (endsWith == true){
            System.out.println("damskie");
        }
        else
            System.out.println("meskie");



        /* inna propozycja: char znak= imie.charAt(iloscZnakow-1);
        if (znak == 'a' || znak== 'A'
        {
            System.out.println("damskie");
        }
        else
            System.out.println("meskie");


         */
    }
    }
