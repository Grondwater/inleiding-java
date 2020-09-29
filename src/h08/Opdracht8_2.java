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
    Label counter;

    public void init() {
        setBackground(Color.CYAN);
        man = new Button("Man");
                man.addActionListener(new ManListener());
                        add(man);

        vrouw = new Button("Vrouw");
                vrouw.addActionListener(new VrouwListener());
                        add(vrouw);

        jongen = new Button("Jongen");
                jongen.addActionListener(new JongenListener());
                        add(jongen);

    }
    
    public void paint(Graphics g){


    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = counter.getText();
            counter.setText(message);
        }

    }

}
