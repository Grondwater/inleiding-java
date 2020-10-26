package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht11_8 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 500;
        int x = 500;
        int height = 8;
        int width = 8;

        for (teller = 0; teller < 101; teller++) {
            x -= 4;
            y -= 4;
            height += 8;
            width += 8;
            g.drawOval(x, y, width, height);
        }
    }
}
