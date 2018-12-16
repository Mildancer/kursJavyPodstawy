package _4_Kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _3_Mapa {

    public static void main(String[] args) {

        Map<String, Integer> inwentarz = new HashMap<>();  // typy prymitywne niedozwolone w <> -dlatego nie moze byc int

        inwentarz.put("Mysz",4);  // do mapy dodaje sie za pomoca puta, a nie add
        inwentarz.put("Glosniki",10);
        inwentarz.put("Monitor",1);
        inwentarz.put("klawiatura",2);

        System.out.println(inwentarz);

        Map<String, Integer> inwentarz2 = new TreeMap<>();  // kolejnosc alfabetyczna

        inwentarz2.put("Mysz",4);  // do mapy dodaje sie za pomoca puta, a nie add
        inwentarz2.put("Glosniki",10);
        inwentarz2.put("Monitor",1);
        inwentarz2.put("klawiatura",2);

        System.out.println(inwentarz2);
        System.out.println(inwentarz2.keySet());
        //inwentarz.keySet() //pobieranie wszystkich kluczy

        // petla sumujaca int -ilosc na stanie  w calej mapie

        int suma = 0;

        for (String klucz: inwentarz.keySet()){
            suma = suma + inwentarz.get(klucz);
        }

            System.out.println("Ilosc produktow: " + suma);

    }
}
