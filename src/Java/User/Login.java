package User;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;


public class Login extends JFrame implements ActionListener{

    JTextField Username;
    JPasswordField Password;
    JButton Accedi;

    public Login() {
        super("Echo");
        Username = new JTextField();
        Password = new JPasswordField();
        Accedi = new JButton("Accedi");

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(Accedi);

        JPanel p = new JPanel(new GridLayout(6, 2));
        p.add(new JLabel("Username:"));
        p.add(Username);
        p.add(new JLabel("Password:"));
        p.add(Password);
        p.add(p1);


    setContentPane(p);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(300, 250);
    setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

    }

}
