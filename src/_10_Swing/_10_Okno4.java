package _10_Swing;

import javax.swing.*;
import javax.xml.transform.OutputKeys;
import java.awt.*;

public class _10_Okno4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamyka program po zamknieciu okienka
        frame.setSize(600,400);                 // za pomoca setterow ustawia sie  wyglad okna
        frame.setTitle("To nasze drugie okno");
        JLabel label = new JLabel("Ala ma kota");  // wyswietli taki komunikat

        label.setHorizontalAlignment(SwingConstants.CENTER); // do wysrodkowania labela (czyli w naszym przypadku tekstu) - center na srodku, top u gory
        label.setFont(new Font("Arial", Font.BOLD, 40)); // dodanie czcionki z nastepujacymi parametrami nazwa czcianki, styl, rozmiar // czcionki zainstalowanie w systemie
        label.setForeground(Color.BLUE); // ustawienie koloru czcionki (foreground czcionka), background tlo



        //4. zakodowanie kolorow skladowych w jednej liczbie typu int
        // w taki sposob, ze w systemie  szesnastkowym mamy po dwie cyfry na kolor:
        // 0xRRGGBB
        Color kolorTla = new Color(0xFFFF90);

        frame.add(label);

        JButton button = new JButton("OK"); // dodanie przycisku
        button.setFont(new Font("Arial", Font.BOLD, 40));
        frame.add(button, BorderLayout.NORTH); // przycisk na polnocy

        frame.setVisible(true); // by stal sie widoczny
    }


}
