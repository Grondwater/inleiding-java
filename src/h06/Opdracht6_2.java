package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_2 extends Applet {

    double seconden;
    double minuut;
    double uur;
    double dag;
    double jaar;
    double antwoorduur;
    double antwoorddag;
    double antwoordjaar;

    public void init(){
        setBackground(Color.CYAN);
        seconden = 1;
        minuut = 60;
        antwoorduur = minuut * 60;
        uur = 3600;
        antwoorddag = uur * 24;
        dag = 86400;
        antwoordjaar = dag * 365;
    }

    public void paint(Graphics g){
    g.setColor(Color.BLACK);
    //Berekening één uur
        String antwoorduurString = minuut + "x" + 60 + "=" + antwoorduur + "seconden";
        g.drawString(antwoorduurString,50,50);
    //Berekening één dag
        String antwoorddagString = uur + "x" + 24 + "=" + antwoorddag + "seconden";
        g.drawString(antwoorddagString,50,70);
    //Berekening één jaar
        String antwoordjaarString = dag + "x" + 365 + "=" + antwoordjaar + "seconden";
        g.drawString(antwoordjaarString,50,90);

    }
}
