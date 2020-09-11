package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
        setBackground(Color.BLACK);
        resize(500,500);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRoundRect(25,50,50,50,0,0);
        g.drawLine(25,50,50,25);
        g.drawLine(75,50,50,25);
    }

}
