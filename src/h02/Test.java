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
        g.drawString("Hallo daapi's",50,50);
    }
}
