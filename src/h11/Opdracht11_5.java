package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht11_5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 50;
        int x = 50;
        int height = 25;
        int width = 25;

        for (teller = 0; teller < 5; teller++) {
            y += height;
            x += width;
            g.drawRect(x, y, width, height);
        }
    }
}