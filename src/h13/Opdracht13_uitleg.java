package h13;

import java.applet.Applet;
import java.awt.*;


public class Opdracht13_uitleg extends Applet {

    double gemiddelde;

    public void init() {
        double c = 6;
        double d = 7;
        gemiddelde = berekenGemiddelde( c, d);
    }

    public void paint(Graphics g) {
        g.drawString("het gemiddelde is: "  +  gemiddelde, 50,50);
    }

    double berekenGemiddelde(double a, double b) {
        double som;
        som = a + b;
        gemiddelde = som / 2;
        return gemiddelde;
    }


}
