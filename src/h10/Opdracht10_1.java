package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet {

    TextField tekstvak;
    String getal;

    public void init() {
        tekstvak = new TextField("",30);
                add(tekstvak);
                tekstvak.addActionListener(new TijdelijkeListener());
        getal = "...";
    }

    public void paint(Graphics g) {
        g.drawString("Type een getal tussen de 1 en 10.",50,90);
        tekstvak.setLocation(50,100);
        g.drawString(getal, 50,150);
    }

    class TijdelijkeListener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            String userInput = tekstvak.getText();
            if ("1".equals(userInput)) {
                getal = "Uw getal is 1";
            } else if ("2".equals(userInput)) {
                getal = "Uw getal is 2";
            } else if ("3".equals(userInput)) {
                getal = "Uw getal is 3";
            } else if ("4".equals(userInput)) {
                getal = "Uw getal is 4";
            } else if ("5".equals(userInput)) {
                getal = "Uw getal is 5";
            } else if ("6".equals(userInput)) {
                getal = "Uw getal is 6";
            } else if ("7".equals(userInput)) {
                getal = "Uw getal is 7";
            } else if ("8".equals(userInput)) {
                getal = "Uw getal is 8";
            } else if ("9".equals(userInput)) {
                getal = "Uw getal is 9";
            } else if ("10".equals(userInput)) {
                getal = "Uw getal is 10";
            } else {
                getal = "Incorrect!";
            }
            repaint();
        }

    }

}
