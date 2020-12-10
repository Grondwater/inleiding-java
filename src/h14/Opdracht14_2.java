package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Opdracht14_2 extends Applet {

    Button knop1;
    String kaart[] = {"Schoppen","Harten","Klaver","Ruiten"},
            nummer[] = {"Aas", "Heer", "Vrouw", "Boer", "Tien", "Negen", "Acht", "Zeven", "Zes", "Vijf", "Vier", "Drie", "Twee"};
    int current, y, x, thirtheen;

    ArrayList<String> card = new ArrayList<>();

    public void init() {
        setSize(1000,1000);
        knop1 = new Button("Ok");
        knop1.addActionListener( new But1Listener() );
        add(knop1);
        current = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Player 1:",40,50);
        g.drawString("Player 2:",160,50);
        g.drawString("Player 3:",280,50);
        g.drawString("Player 4:",400,50);
        for (int i = 0; i < 52; i++) {
            if (i == thirtheen) {x+=120;y=80;thirtheen +=13;}
            g.drawString(card.get(i), x, y);
            y += 20;
        }
    }

    class But1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            x = 40;
            y = 80;
            thirtheen = 13;
            for (int u = 0; u < 4; u++) {
                for (int k = 0; k < 13; k++) {
                    card.add(kaart[u] + " " + nummer[k]);
                }
            }
            Collections.shuffle(card);
            repaint();
        }
    }
}