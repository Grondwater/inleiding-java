package h12;
import java.awt.*;
import java.applet.*;

public class Opdracht12_3 extends Applet  {
    double[] salary;
    double[] copy;

    public void init() {
        salary = new double[5];
        copy = new double[5];

        for (int counter = 0; counter < salary.length; counter ++) {
            salary[counter] = 100 * counter + 100;
        }
        for (int counter = 0; counter < salary.length; counter ++) {
            copy[counter] = salary[counter];
        }
        copy[3] = 1000;
    }

    public void paint(Graphics g) {
        for (int counter = 0; counter < salary.length; counter ++) {
            g.drawString("" + copy[counter], 50, 20 * counter + 20);
            g.drawString("" + salary[counter], 100, 20 * counter + 20);
        }
    }
}
