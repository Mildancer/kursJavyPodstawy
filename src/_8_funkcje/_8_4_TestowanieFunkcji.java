package _8_funkcje;

public class _8_4_TestowanieFunkcji {

    public static void main(String[] args) {
        double[] liczby ={0,5,1.5,-1,10};

        for (double liczba:liczby) {  // : dla kazdego  elementu petli
            double kwadrat = _8_2_FunkcjeGeometryczne.poleKwadratu(liczba);
            double kolo = _8_2_FunkcjeGeometryczne.poleKola(liczba);



            System.out.println("Dla liczby " + liczba + ", a pole kola:" + kolo);
        }

    }
}
