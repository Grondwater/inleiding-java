package h02;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {
    //Hier kan je commentaar/uitleg schrijven zonder dat de code dat leest.
    public void init() {
        setBackground(Color.cyan);
        resize(500,500);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Hallo daapi's",100,68);
        g.drawLine(100,70,270,70);
        g.setColor(Color.WHITE);
        g.fillRoundRect(10,100,110,110,50,50);
        g.setColor(Color.BLACK);
        g.drawOval(125,100,50,100);
        g.fillArc(175,150,100,50,90,90);
       //Driehoek
        g.drawLine(225,250,275,250);
        g.drawLine(225,250,250,225);
        g.drawLine(275,250,250,225);
        g.drawLine(225,150,225,150);
        //Huis
        g.setColor(Color.BLACK);
        g.fillRoundRect(25,50,50,50,0,0);
        g.drawLine(25,50,50,25);
        g.drawLine(75,50,50,25);
        g.setColor(Color.WHITE);
        g.fillRoundRect(30,85,7,20,0,0);
        g.fillRoundRect(47,85,23,7,0,0);

    }


}

