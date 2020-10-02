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
        g.drawString("Type een getal tussen de 1 en 10.",50,50);
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
            else {
                getal = "....";
            }
            repaint();
        }

    }

}
