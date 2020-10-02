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
            if (userInput.equals("1") ) {
                getal = "Uw getal is 1";
            } else if (userInput.equals("2") )
                getal = "Uw getal is 2";
              else if (userInput.equals("3") )
                  getal = "Uw getal is 3";
              else if (userInput.equals("4") )
                  getal = "Uw getal is 4";
            else if (userInput.equals("5") )
                getal = "Uw getal is 5";
            else if (userInput.equals("6") )
                getal = "Uw getal is 6";
            else if (userInput.equals("7") )
                getal = "Uw getal is 7";
            else if (userInput.equals("8") )
                getal = "Uw getal is 8";
            else if (userInput.equals("9") )
                getal = "Uw getal is 9";
            else if (userInput.equals("10") )
                getal = "Uw getal is 10";


            else {
                getal = "Incorrect!";
            }
            repaint();
        }

    }

}
