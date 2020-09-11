package h02;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {
    //Hier kan je commentaar/uitleg schrijven zonder dat de code dat leest.
    public void init() {
        setBackground(Color.cyan);
        resize(750,750);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Hallo daapi's",100,68);
        g.drawLine(100,70,200,70);
        g.setColor(Color.WHITE);
        g.fillRoundRect(10,100,110,110,50,50);
        g.setColor(Color.BLACK);
        g.drawOval(125,100,50,100);
        g.fillArc(175,150,100,50,90,90);
       //Driehoek
        g.drawLine(225,250,275,250);
        g.drawLine(225,250,250,225);
        g.drawLine(275,250,250,225);
        g.drawLine(225,150,225,150);
        //Huis
        g.setColor(Color.BLACK);
        g.fillRoundRect(25,50,50,50,0,0);
        g.drawLine(25,50,50,25);
        g.drawLine(75,50,50,25);
        g.setColor(Color.WHITE);
        g.fillRoundRect(30,85,7,20,0,0);
        g.fillRoundRect(47,85,23,7,0,0);
        //Nederlandse vlag
        g.setColor(Color.black);
        g.drawLine(225,23,225,100);
        g.setColor(Color.RED);
        g.fillRoundRect(226,25,25,5,0,0);
        g.setColor(Color.WHITE);
        g.fillRoundRect(226,30,25,5,0,0);
        g.setColor(Color.BLUE);
        g.fillRoundRect(226,35,25,5,0,0);
        //Staaf diagram
        g.setColor(Color.BLACK);
        g.fillRoundRect(50,275,200,200,0,0);
        g.setColor(Color.WHITE);
        g.drawLine(70,450,225,450);
        g.drawLine(75,450,75,275);
        g.drawLine(125,450,125,275);
        g.drawLine(175,450,175,275);
        g.drawLine(225,450,225,275);
        g.drawLine(70,430,75,430);
        g.drawLine(70,410,75,410);
        g.drawLine(70,390,75,390);
        g.drawLine(70,370,75,370);
        g.drawLine(70,350,75,350);
        g.setColor(Color.white);
        g.drawString("0",63,450);
        g.drawString("20",57,430);
        g.drawString("40",57,410);
        g.drawString("60",57,390);
        g.drawString("80",57,370);
        g.drawString("100",50,350);
        g.drawString("Valerie",80,470);
        g.drawString("Jeroen",130,470);
        g.drawString("Hans",185,470);
        g.setColor(Color.pink);
        g.fillRoundRect(76,410,49,40,0,0);
        g.setColor(Color.GREEN);
        g.fillRoundRect(126,350,49,100,0,0);
        g.setColor(Color.blue);
        g.fillRoundRect(176,370,49,80,0,0);
        //Ellips met gele achtergrond
        g.setColor(Color.YELLOW);
        g.fillArc(300,150,75,50,0,500);
        g.setColor(Color.BLACK);
        g.drawArc(300,150,75,50,0,500);
        //Stoplicht
        g.setColor(Color.BLACK);
        g.fillRoundRect(450,100,5,50,0,0);
        g.fillRoundRect(440,60,25,40,5,5);
        g.setColor(Color.RED);
        g.fillRoundRect(448,65,10,10,5,5);
        g.setColor(Color.ORANGE);
        g.fillRoundRect(448,75,10,10,5,5);
        g.setColor(Color.GREEN);
        g.fillRoundRect(448,85,10,10,5,5);
        //Dobbelsteen
        g.setColor(Color.WHITE);
        g.fillRoundRect(408,100,20,20,3,3);
        g.setColor(Color.BLACK);
        g.fillRoundRect(412,114,4,4,2,2);
        g.fillRoundRect(420,114,4,4,2,2);
        g.fillRoundRect(412,105,4,4,2,2);
        g.fillRoundRect(420,105,4,4,2,2);


    }
}

