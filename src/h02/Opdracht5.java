package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    Color valerie;
    Color hans;
    Color jeroen;
    int breedte;
    int hoogte;
    int breedte2;
    int hoogte2;

    public void init() {
        //initialisatie.
        opvulkleur = Color.BLACK;
        lijnkleur = Color.WHITE;
        valerie = Color.pink;
        hans = Color.GREEN;
        jeroen = Color.BLUE;
        breedte = 250;
        hoogte = 250;
        breedte2 = 230;
        hoogte2 = 230;

    }

    public void paint(Graphics g) {
        g.setColor(opvulkleur);
        g.fillRect(25,25,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawLine(75,25,75,230);
        g.drawLine(75,230,275,230);
        g.drawLine(125,230,125,25);
        g.drawLine(175,230,175,25);
        g.drawLine(225,230,225,25);
        g.drawString("0",65,230);
        g.drawString("20",60,210);
        g.drawString("40",60,190);
        g.drawString("60",60,170);
        g.drawString("80",60,150);
        g.drawString("100",55,130);
        g.drawString("Valerie",80,240);
        g.drawString("Jeroen",130,240);
        g.drawString("Hans",185,240);
        g.setColor(valerie);
        g.fillRoundRect(76,190,49,40,0,0);
        g.setColor(jeroen);
        g.fillRoundRect(126,130,49,100,0,0);
        g.setColor(hans);
        g.fillRoundRect(176,150,49,80,0,0);


    }
}
