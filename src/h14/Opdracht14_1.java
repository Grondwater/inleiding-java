package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht14_1 extends Applet{

    Button but1;
    String kaarten[] = {"Schoppen","Harten","Klaver","Ruiten"},
            number[] = {"Aas", "Heer", "Vrouw", "Boer", "Tien", "Negen", "Acht", "Zeven", "Zes", "Vijf", "Vier", "Drie", "Twee"};
    String kaart[] = {};
    int t, i;

    public void init() {

        but1 = new Button("Volgende Kaart");
        but1.addActionListener( new But1Listener() );
        add(but1);
    }

    public void paint(Graphics g) {

        g.drawString(kaarten[t] + " " + number[i],20,20);
    }

    class But1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double r = Math.random();

            t = (int)(r*4);
            i = (int)(r*12);
            repaint();
        }
    }
}