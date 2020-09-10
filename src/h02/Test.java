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
        g.fillRoundRect(10,100,110,110,50,50);
        g.drawOval(125,100,50,100);
        g.fillArc(175,150,100,50,90,90);
    }


}

