package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_1 extends Applet {
    //voor gehele getallen.
    int getal1;
    int getal2;
    int optelsom;
    //voor komma getallen.
    double factor1;
    double factor2;
    double product;

    public void init() {
        setBackground(Color.CYAN);
        getal1 = 4;
        getal2 = 2;
        factor1 = 113;
        factor2 = 4;
        optelsom = getal1 / getal2;
        product = factor1 / factor2;
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        //Berekening van 113 ÷ 4 =
        String optelsomString = factor1 + "÷" + factor2 + "=" + product;
        g.drawString(optelsomString,50,50);
        g.drawString("Jan krijgt  " + product,50,65);
        g.drawString("Ali krijgt  " + product,50,80);
        g.drawString("Jeannette krijgt  " + product,50,95);
        g.drawString("Douwe krijgt  " + product,50,110);
    }
}
