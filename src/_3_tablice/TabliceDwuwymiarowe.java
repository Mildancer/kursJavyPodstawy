package _3_tablice;

import java.util.Random;

public class TabliceDwuwymiarowe {
    public static void main(String[] args) {


        int[][] tablica2d = new int[4][4];

        for (int i = 0; i < tablica2d.length; i++) {

            for (int j = 0; j < tablica2d[i].length; j++) {
                System.out.print(tablica2d[i][j] + " ");

            }
            System.out.println();


        }

        int[][] tablica2d2 = new int[100][100];


        Random generator = new Random(); //wypelnianie losowo
        generator.nextInt(100); //wypelnianie do 100

        for (int i = 0; i < tablica2d2.length; i++) {

            for (int j = 0; j < tablica2d2[i].length; j++) {
               tablica2d[i][j] = generator.nextInt(101);

            }

        }



        for (int i = 0; i < tablica2d2.length; i++) {

            for (int j = 0; j < tablica2d2[i].length; j++) {
                System.out.print(tablica2d2[i][j] + " ");

            }
            System.out.println();


        }
    }
}
