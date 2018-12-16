package _2_typy_danych;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypPieniezny {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("7.38");
        BigDecimal b = new BigDecimal("3.99") ; // dla liczb, ktore musza byc dokladne, bo czasem sa drobne bledy obliczeniowe np jak liczba jest nieskonczona 0.33333

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b).setScale(2,RoundingMode.HALF_UP); // zaokraglanie po wykonaniu dzialania, dlatego setscale, a nie jest potrzebna do dzialania
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP); // 2 miejsca po przecinku + zaokraglenie w gore, trzeba to tak zapisac, o aaplikacja mozae sie wysypac


        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);

    }

}
