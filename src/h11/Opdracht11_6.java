package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht11_6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 100;
        int x = 100;
        int height = 20;
        int width = 20;

        for (teller = 0; teller < 5; teller++) {
            x -= 10;
            y -= 10;
            height += 20;
            width += 20;
            g.drawOval(x, y, width, height);
        }
    }
}
