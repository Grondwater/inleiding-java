package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_3 extends Applet {

    int positief1;
    int positief2;
    int antwoord;
    public void init(){
        setBackground(Color.CYAN);
        positief1 = 343;
        positief2 = 432;
        antwoord = positief1 + positief2;
        antwoord = antwoord * -1;
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        String antwoordString = positief1 + "+" + positief2 + "=" + antwoord;
        g.drawString(antwoordString,50,50);
    }
}
