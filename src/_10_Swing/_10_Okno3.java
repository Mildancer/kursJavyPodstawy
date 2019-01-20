package _10_Swing;

import javax.swing.*;
import java.awt.*;

public class _10_Okno3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamyka program po zamknieciu okienka
        frame.setSize(600,400);                 // za pomoca setterow ustawia sie  wyglad okna
        frame.setTitle("To nasze drugie okno");
        JLabel label = new JLabel("Ala ma kota");  // wyswietli taki komunikat

        label.setHorizontalAlignment(SwingConstants.CENTER); // do wysrodkowania labela (czyli w naszym przypadku tekstu) - center na srodku, top u gory
        label.setFont(new Font("Arial", Font.BOLD, 40)); // dodanie czcionki z nastepujacymi parametrami nazwa czcianki, styl, rozmiar // czcionki zainstalowanie w systemie
        label.setForeground(Color.BLUE); // ustawienie koloru czcionki (foreground czcionka), background tlo

        // mozliwosci ustawiania kolorow

        /*
        // 1) użyć gotowej stałej
        Color kolorTla = Color.YELLOW;

        label.setOpaque(true);              //opaque do ustawienia koloru tla- w tym przypadku nieprzezroczysty kolo tla
        label.setBackground(kolorTla);

        // 2. podac wartosci kolorow podstawowych w zakresie od 0 do 1.00 jako float RGB

        Color  koloTla = new Color(1.0f, 1.0f, 0.5f);



        //3. podac wartosci kolorow podstawowych w zakresie od 0 do 255 jako int

        Color  koloTla = new Color(255, 255, 150);
          */

        //4. zakodowanie kolorow skladowych w jednej liczbie typu int
        // w taki sposob, ze w systemie  szesnastkowym mamy po dwie cyfry na kolor:
        // 0xRRGGBB
        Color kolorTla = new Color(0xFFFF90);

        frame.add(label);
        frame.setVisible(true); // by stal sie widoczny
    }


}
