package h11;

import java.applet.Applet;
import java.awt.*;


public class Opdracht11_2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        for (int teller = 20, y = 0; teller > 10; teller--, y = y + 20) {
            y += 20;
            g.drawString(" " + teller, 50, y);
        }
    }
}