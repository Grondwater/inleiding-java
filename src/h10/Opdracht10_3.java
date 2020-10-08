package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_3 extends Applet {

Button klik;
    TextField maandNummer;
    TextField jaarNummer;
    Label sticker;
    String text = "";


    public void init() {

        klik = new Button("Klik");
        klik.addActionListener(new motheListener());
        add(klik);

        maandNummer = new TextField();
        maandNummer.addActionListener(new motheListener());
        add(maandNummer);

        jaarNummer = new TextField();
        jaarNummer.addActionListener(new motheListener());
        add(jaarNummer);

        sticker = new Label();
        add(sticker);

    }

    public void paint(Graphics g) {
        maandNummer.setLocation(20, 40);
        maandNummer.setSize(40, 20);

        jaarNummer.setLocation(20, 70);
        jaarNummer.setSize(40, 20);

        klik.setLocation(20, 100);
        klik.setSize(40, 20);

        sticker.setLocation(20, 130);
        sticker.setSize(200, 100);
    }

    class motheListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            int monthNumber = Integer.parseInt(maandNummer.getText());
            int year = Integer.parseInt(jaarNummer.getText());

            if (monthNumber == 1) {
                text = "januari 31 dagen ";
            } else if (monthNumber == 2) {
                if (year % 4 == 0) {
                    text = "februari 29 dagen";
                } else {
                    text = "februari 28 dagen";
                }
            } else if (monthNumber == 3) {
                text = "maart 31 dagen";
            } else if (monthNumber == 4) {
                text = "april 30 dagen ";
            } else if (monthNumber == 5) {
                text = "mei 31 dagen";
            } else if (monthNumber == 6) {
                text = "juni 30 dagen";
            } else if (monthNumber == 7) {
                text = "juli 31 dagen";
            } else if (monthNumber == 8) {
                text = "augustus 31 dagen";
            } else if (monthNumber == 9) {
                text = "september 30 dagen";
            } else if (monthNumber == 10) {
                text = "oktober 31 dagen";
            } else if (monthNumber == 11) {
                text = "november 30 dagen";
            } else if (monthNumber == 12) {
                text = "december 31 dagen";
            } else {
                text = "Geen geldige invoer!";
            }

            sticker.setText(text);
            repaint();
        }
    }


}