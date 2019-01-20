package _9_Kalkulator;

import java.util.Scanner;

public class _9_1_KalkulatorKonsolowy {


    public static void main(String[] args) {
        System.out.println("Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println("Zakończ wpisując napis nie będący liczbą");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);  // scanner wymaga spacji domyslnie // spacji moze byc wiecej niz 1
        while (true) {
            System.out.print("> ");
            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next(); //next wczytuje tylko 1 slowo a nextLine wczytaja cala linie
                double arg2 = wejscie.nextDouble();

                // TODO

                // 1.
                double wynik = oblicz(arg1, arg2, operacja);
                System.out.println("    wynik switcha: " + wynik);


            //2.
             //   double wynik =0;

                if (operacja.equals("+")  ){ // porownywanie equels zamiast == // gdy bardziej skomplikowane warunki logiczne
                    wynik = arg1 + arg2;
                }
                else if (operacja.equals("-")  ){
                    wynik = arg1 - arg2;
                }

                 else if (operacja.equals("*"))  {
                    wynik = arg1 * arg2;
                }

                else if (operacja.equals("/"))  {
                    wynik = arg1 / arg2;
                }
                else {
                    System.out.println("Nie ma takie operacji: " + operacja);
                }

                System.out.println("wynik operacji if: " + wynik);

                // 3.







            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Dziekujemy, papa");
    }

    private static double oblicz(double arg1, double arg2, String operacja) {       // wydzielone do obrebnej metody refactor => extract => method
        double wynik;
        switch(operacja) {                  // uzywamy zamiast ifa, gdy mamy pewne konkretne wartoscci
            case "+":
                wynik = arg1 + arg2;
                break;                  // by program nie poszedl dalej
            case "-":
                wynik = arg1 - arg2;
                break;                  // by program nie poszedl dalej
            case "*":
                wynik = arg1 * arg2;
                break;                  // by program nie poszedl dalej
            case "/":
                wynik = arg1 / arg2;
                break;                  // by program nie poszedl dalej
            default:
                wynik = 0;
        }
        return wynik;
    }
/* inny sposob zapisu powyzszej funkcji-ponizej mniej kodu
    private static double oblicz(double arg1, double arg2, String operacja) {
        switch(operacja) {
            case "+": return arg1 + arg2;
            case "-": return arg1 - arg2;
            case "*": return  arg1 * arg2;
            case "/": return arg1 / arg2;
            default:  return 0;             // default: throw new IllegalArgumentException("Nieznana operacja " + operacja)
        }
    }


}
*/

/*
  // jeżeli uzytkownik wpisał coś, co nie jest doublem
           if(! wejscie.hasNextDouble()) {
               break; // koniec
           }
           try {
               double arg1 = wejscie.nextDouble();
               String operacja = wejscie.next();
               double arg2 = wejscie.nextDouble();

               double wynik = oblicz(arg1, arg2, operacja);
               System.out.println("    wynik: " + wynik);
           } catch(Exception e) {
               System.out.println("Błąd: " + e);  // zobaczymy klasę i message wyjątku
               // System.out.println("Błąd: " + e.getMessage());  // zobaczymy tylko message
           }
       }
       System.out.println("Dziękujemy, papa");
   }

   private static double oblicz(double arg1, double arg2, String operacja) {
       switch(operacja) {
           case "+": return arg1 + arg2;
           case "-": return arg1 - arg2;
           case "*": return arg1 * arg2;
           case "/": return arg1 / arg2;
           default:  throw new IllegalArgumentException("Nieznana operacja " + operacja);
       }
   }

 */

}
