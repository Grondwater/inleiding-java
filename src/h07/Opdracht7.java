package h07;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {



    public void init(){
    setBackground(Color.CYAN);
    setSize(500,500);
}
    public void paint(Graphics g){
    g.setColor(Color.BLACK);
    g.drawString("Mogguh maat",50,50);
    g.drawString("De klasse die word gebruikt is volgens mij Show.",50,70);
}
}
