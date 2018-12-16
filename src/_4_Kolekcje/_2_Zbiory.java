package _4_Kolekcje;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class _2_Zbiory {

    public static <set> void main(String[] args) {
     Set <String> numeryPesel = new HashSet<>();                     //kolejnosc  nie jest zapewniona i elementy sie nie powtarzaja (tym sie rozni od listy)

        numeryPesel.add("1234567881");
        numeryPesel.add("2234567881");
        numeryPesel.add("3234567881");
        numeryPesel.add("4234567881");
        numeryPesel.add("5234567881");

        System.out.println(numeryPesel);

        if (numeryPesel.contains("3234567881") ){
        System.out.println("tak");}
        else {
            System.out.println("nie");
        }


        Set<String> posortowany = new TreeSet<>();

        posortowany.addAll(numeryPesel); // do zbioru posortowany dodanie elementow zbioru z numeryPesel

        System.out.println(posortowany);


        Set<String> kolejnosc = new LinkedHashSet<>(); // kolejnosc tych elementow zostanie zachowana

        kolejnosc.add("Wojciech");
        kolejnosc.add("Bartek");
        kolejnosc.add("Andrzej");
        kolejnosc.add("Tomek");

        System.out.println(kolejnosc);


    }
}
