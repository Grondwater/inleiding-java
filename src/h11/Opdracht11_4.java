package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4 extends Applet {
    public void init (){
    }
    public void paint(Graphics g){
        int teller;
        int y = 20;
        for (teller = 0; teller <=30; teller+=3 ) {
            y+= 20;
            g.drawString("De tafel van 3",20,20);
            g.drawString("" + teller ,30,y);
        }
    }
}