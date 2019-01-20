package _10_Swing;

import javax.swing.*;
import java.awt.*;

public class _10_Okno2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamyka program po zamknieciu okienka
        frame.setSize(600,400);
        frame.setTitle("To nasze drugie okno");
        JLabel label = new JLabel("Ala ma kota");  // wyswietli taki komunikat

        frame.add(label);
        frame.setVisible(true); // by stal sie widoczny
    }


}
