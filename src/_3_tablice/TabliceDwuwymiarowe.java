package _3_tablice;

public class TabliceDwuwymiarowe {
    public static void main(String[] args) {


        int[][] tablica2d = new int[4][4];

        for (int i = 0; i < tablica2d.length; i++) {

            for (int j = 0; j < tablica2d[i].length; j++) {
                System.out.print(tablica2d[i][j] + " ");

            }
            System.out.println();


        }


    }
}
