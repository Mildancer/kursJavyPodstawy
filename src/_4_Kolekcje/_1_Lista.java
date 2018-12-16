package _4_Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _1_Lista {
    public static void main(String[] args) {

        List<String> imiona = new ArrayList<String>(); // lista oparta na tablicy

        imiona.add("Wojciech");
        imiona.add("Justyna");
        imiona.add("Milosz");
        imiona.add("Agata");

        // imiona.addAll()// pozwala dodac wszystkie elementy zinnej listy
        System.out.println(imiona);

        System.out.println("Rozmiar: " + imiona.size());

        System.out.println("Pozycja 1: " + imiona.get(1)); // wypisanie 1wszej pozycji z listy

        for (String imie : imiona) {
            if (imie.endsWith("a")) {
                System.out.println(imie);
                break; // break przerywa petle ktora sie wykonala (iteracje petli)
            }
        }
        System.out.println();
        System.out.println("Po usunieciu: ");
        imiona.remove("Wojciech");  // usuwanie z listy
        System.out.println(imiona);

        if (imiona.contains("Justyna")) {  // sprawdzenie, czy lista zawiera
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

       // imiona.sort(); // chce od nas comparator

        Collections.sort(imiona); //sortowanie alfabetycznie

        System.out.println(imiona);

      //  List<String> imiona = new LinkedList<>(); inny rodzaj listy elementy przywiazane sa

    }
}
