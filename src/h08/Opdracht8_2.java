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

        counter = 0 ;
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
    }
    
    public void paint(Graphics g){

        manCounter.setLocation(50,100);
        manCounter.setName("Deelnames " + counter);
        manCounter.setSize(150,50);
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            manCounter.setText("Mannen " + counter1);
            repaint();
            String message = manCounter.getText();
            counter++;
        }

    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



        }

    }

    class JongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



        }

    }

    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



        }

    }



}
