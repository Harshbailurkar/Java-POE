//8. Write a program to using JPasswordField to set the password character as ‘#’ instead of ‘*’.

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class p8_JPassword extends JFrame {
    p8_JPassword() {
        setVisible(true);
        setSize(600, 600);
        setLayout(new GridLayout(5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Name");
        add(l1);
        JTextField t1 = new JTextField();
        add(t1);
        JLabel l2 = new JLabel("Passward");
        add(l2);
        JPasswordField p1 = new JPasswordField();
        p1.setEchoChar('#');
        add(p1);
    }

    public static void main(String[] args) {
        new p8_JPassword();
    }
}
