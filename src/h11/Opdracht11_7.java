package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht11_7 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 300;
        int x = 300;
        int height = 10;
        int width = 10;

        for (teller = 0; teller < 51; teller++) {
            x -= 5;
            y -= 5;
            height += 10;
            width += 10;
            g.drawOval(x, y, width, height);
        }
    }
}