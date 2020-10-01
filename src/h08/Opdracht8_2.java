package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_2 extends Applet {

    Button man;
    Button vrouw;
    Button jongen;
    Button meisje;
    Label totaal;
    Label manCounter;
    Label vrouwCounter;
    Label jongenCounter;
    Label meisjeCounter;
    int counter;
    int counter1;

    public void init() {
        setBackground(Color.CYAN);

        counter = 1 ;
        counter1 = 1;

        man = new Button("Man");
                man.addActionListener(new ManListener());
                        add(man);

        vrouw = new Button("Vrouw");
                vrouw.addActionListener(new VrouwListener());
                        add(vrouw);

        jongen = new Button("Jongen");
                jongen.addActionListener(new JongenListener());
                        add(jongen);

        meisje = new Button("Meisje");
                meisje.addActionListener(new MeisjeListener());
                        add(meisje);

        manCounter = new Label("Mannen " + counter);
                add(manCounter);

        vrouwCounter = new Label("Vrouwen " + counter);
                add(vrouwCounter);

        jongenCounter = new Label("Jongens " + counter);
                add(jongenCounter);

        meisjeCounter = new Label("Meisjes " + counter);
                add(meisjeCounter);
    }
    
    public void paint(Graphics g){

        manCounter.setLocation(50,75);
        manCounter.setName("Deelnames " + counter);
        manCounter.setSize(150,30);

        vrouwCounter.setLocation(50,105);
        vrouwCounter.setName("Deelnames " + counter);
        vrouwCounter.setSize(150,30);

        jongenCounter.setLocation(50,135);
        jongenCounter.setName("Deelnames " + counter);
        jongenCounter.setSize(150,30);

        meisjeCounter.setLocation(50,165);
        meisjeCounter.setName("Deelnames " + counter);
        meisjeCounter.setSize(150,30);
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            manCounter.setText("Mannen "  + counter);
            repaint();
            String message = manCounter.getText();
            counter++;
        }

    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            vrouwCounter.setText("Vrouwen "  + counter);
            repaint();
            String message = vrouwCounter.getText();
            counter++;


        }

    }

    class JongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            jongenCounter.setText("Jongens "  + counter);
            repaint();
            String message = jongenCounter.getText();
            counter++;


        }

    }

    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            meisjeCounter.setText("Meisjes "  + counter);
            repaint();
            String message = meisjeCounter.getText();
            counter++;


        }

    }



}
