package h02;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {
    //Hier kan je commentaar/uitleg schrijven zonder dat de code dat leest.
    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Hallo daapi's",50,68);
        g.drawLine(50,70,270,70);
        g.fillRoundRect(75,100,110,110,50,50);
        g.drawOval(10,100,50,100);
    }


}

