package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_2 extends Applet {
    Button[] ewoud;

    public void init(){
        ewoud = new Button[25];
        ewoud[0]=new Button();
        for (int teller = 0; teller < ewoud.length; teller++) {
            ewoud[teller] = new Button("Test." + teller);
            System.out.println(ewoud[teller]);
        }

    }

    public void paint(Graphics g){

    }



}