package _10_Swing;

import javax.swing.*;
import java.awt.*;

public class _10_Okno5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamyka program po zamknieciu okienka
        frame.setSize(600,400);                 // za pomoca setterow ustawia sie  wyglad okna
        frame.setTitle("To nasze drugie okno");


        //layout manager do rozmierzenia obiektow w oknie . domyslnie borderlayout
        LayoutManager layout = new FlowLayout();
        frame.setLayout(layout);


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
        frame.add(button); //



        JButton button2 = new JButton("Drugi guzik");
        button2.setFont(new Font("Arial", Font.ITALIC, 32));
        frame.add(button2);



        frame.setVisible(true); // by stal sie widoczny
    }


}
