package h12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht12_6 extends Applet {

    double[] getal = {0, 1, 1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10,};
    boolean gevonden;
    int waarde = 0;
    String tekst = "";
    TextField tekstvak = new TextField("", 15);
    Label label;

    public void init() {
        setSize(400, 400);
        gevonden = false;
        label = new Label("Voer een getal in.");
        add(label);
        tekstvak.addActionListener(new OKListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 20, 50);
    }

    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            int tempgetal = Integer.parseInt(tekstvak.getText());
            for(int teller = 0; teller < getal.length && gevonden == false; teller++) {
                if(tempgetal == getal[teller]) {
                    waarde++;
                }
            }
            if( waarde > 0) {
                tekst = "De waarde is " + waarde + " keer gevonden";
            }
            else {
                tekst = "De waarde is niet gevonden";
            }
            repaint();
            gevonden = false;
            tekstvak.setText("");
            waarde = 0;
        }
    }
}