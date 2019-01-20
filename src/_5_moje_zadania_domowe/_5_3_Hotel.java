package _5_moje_zadania_domowe;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;


public class _5_3_Hotel { public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int ilosc;
    int ilosc1;
    int ilosc2;
    int ilosc3;
    LocalDate przyjazd;
    LocalDate wyjazd;

    long iloscDni;

    double koszt;

    System.out.println("Podaj ilosc doroslych: ");
    // ilosc1 = in.nextLine();
    ilosc1 = Integer.valueOf(in.nextLine());

    System.out.println("Podaj ilosc dzieci: ");
    ilosc2 = Integer.valueOf(in.nextLine());

    System.out.println("Podaj ilosc niemowlat: ");
    ilosc3 = Integer.valueOf(in.nextLine());

    System.out.println("Podaj date przyjazdu(DD/MM/YYYY): ");
    // przyjazd = Date.valueOf(in.nextLine());

    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    przyjazd = LocalDate.parse(in.nextLine(), formatter1);
    System.out.println(przyjazd.format(formatter1));

    System.out.println("Podaj date wyjazdu (DD-MM-YYYY): ");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    wyjazd = LocalDate.parse(in.nextLine(), formatter2);
    System.out.println(wyjazd.format(formatter2));
    iloscDni = DAYS.between(przyjazd, wyjazd);

    System.out.println("Ilosc dób hotelowych: " + iloscDni);

    if (iloscDni <= 7) {
        koszt = (ilosc1 * 180 + ilosc2 * 90 + ilosc3 * 20) * iloscDni;
    }

    else{
        koszt = (long) ((ilosc1 * 180 + ilosc2 * 90 + ilosc3 * 20) * iloscDni * 0.90);
    }
    System.out.println(koszt);
}



/*
3. Pobyt w hotelu
Napisz program, który obliczy cenę za pobyt w hotelu. Zasady są następujące:
• Osoba dorosła płaci 180zł za noc
• Dziecko płaci 90zł za noc
• Niemowlaki płacą 20zł za noc
• Jeśli pobyt jest dłuższy niż 7 dni, to całość zamówienia jest objęta rabatem w wysokości
10%
Zapytaj użytkownika o ilość dorosłych, dzieci i niemowląt, a następnie o datę przyjazdu
i wyjazdu. Oblicz ile nocy jest pomiędzy tymi datami, a następnie ile będzie kosztował pobyt.
 */


}
