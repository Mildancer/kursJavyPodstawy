package _2_typy_danych;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WiekProdukcyjny {

    public static void main(String[] args) {


        Scanner wprowadzenie = new Scanner(System.in);

        System.out.println("Podaj date urodzenia yyyy-MM-dd: ");
        String data = wprowadzenie.nextLine();              //nextline wczytuje znaki uzytkownika, az do entera

        // konwersja daty string na LocalDate


        System.out.println("Podaj plec M/K: ");

        String plec = wprowadzenie.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataUrodzenia = LocalDate.parse(data, formatter);


        // pobranie daty teraz

        LocalDate dzisiaj = LocalDate.now();

        // obliczenie roznicy dat

        Period roznica = Period.between(dataUrodzenia, dzisiaj);

        //sprawdzenie wieku i wyswietlenie wyniku

        System.out.println("Uzytkownik ma tyle lat: " + roznica);


        System.out.println("Wiek uzytkownika w latach: " + roznica.getYears());
        System.out.println("Plec: " + plec);

        if (plec.equals("M")){

            if (roznica.getYears() < 18) {
                System.out.println("Niepelnoletni");
            } else if (roznica.getYears() >= 18 && roznica.getYears() <= 67) {
                System.out.println("Wiek produkcyjny");
            } else {
                System.out.println("Wiek emerytalny");
            }



        }

        else {
            if (roznica.getYears() < 18) {
                System.out.println("Niepelnoletni");
            } else if (roznica.getYears() >= 18 && roznica.getYears() <= 65) {
                System.out.println("Wiek produkcyjny");
            } else {
                System.out.println("Wiek emerytalny");
            }


        }

    }


}
