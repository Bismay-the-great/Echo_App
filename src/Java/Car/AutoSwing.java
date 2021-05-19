package Car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;


public class AutoSwing extends JFrame implements ActionListener{

     JComboBox Marca;
     JComboBox Alimentazione;
     JTextField Km;

     //Le stringhe le ho implementate per fare un esempio e vedere come sarebbe venuto
     String[] marche = {"...", "Mercedes-Benz", "BMW", "Fiat", "Audi", "Ford", "Alfa Romeo", "Volkswagen"};
     String[] alimentazione = {"...", "Benzina", "Diesel", "GPL", "Elettrica"};

    public AutoSwing() {
        super("Car");
        Marca = new JComboBox(marche);
        Alimentazione = new JComboBox(alimentazione);
        Km = new JTextField("0 Km");


        JPanel p1 = new JPanel(new GridLayout(1, 1));
        p1.add(new JLabel("Marca:"));
        p1.add(Marca);

        JPanel p2 = new JPanel(new GridLayout(1,1));
        p2.add(new JLabel("Alimentazione:"));
        p2.add(Alimentazione);

        JPanel p3 = new JPanel(new GridLayout(1, 1));
        p3.add(new JLabel("Km:"));
        p3.add(Km);

        JPanel p = new JPanel(new GridLayout(3, 1));
        p.add(p1);
        p.add(p2);
        p.add(p3);


        setContentPane(p);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
