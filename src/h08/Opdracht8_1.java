package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_1 extends Applet {

    TextField tekstvak;
    Button oke;
    Button reset;
    Label sticker;
    
    public void init() {

        setBackground(Color.CYAN);
        tekstvak = new TextField("Voer uw tekst in.", 30);
        add(tekstvak);
        oke = new Button("Oke!");
        oke.addActionListener(new OkeListener());
        add(oke);
        reset = new Button("Reset!");
        reset.addActionListener(new ResetListener());
        add(reset);
        sticker = new Label();
        add (sticker);

    }

    public void paint(Graphics g) {

        sticker.setSize(250,50);
        tekstvak.setLocation(25, 50);
        oke.setLocation(90, 70);
        reset.setLocation(125, 70);
        sticker.setLocation(20,150);
        sticker.setText("Voer uw tekst hier boven in!");
    }

    class OkeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = tekstvak.getText();
            sticker.setText(message);
        }

    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Voer uw tekst in.");
            repaint();
            String message = tekstvak.getText();
        }

    }

}
