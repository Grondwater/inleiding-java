package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht11_9 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        int y = 50;
        int x = 50;
        int height = 50;
        int width = 50;

        // Eerste rij
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Tweede rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Derde rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Vierde rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Vijfde rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Zesde rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Zevende rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }

        // Achste rij
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += 50;
        }
    }
}