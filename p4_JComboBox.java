//4. Write a program to develop a frame to select the different states of India using JComboBox.

import javax.swing.*;

public class p4_JComboBox extends JFrame {

    p4_JComboBox() {
        setLayout(null);
        setVisible(true);
        setSize(600, 600);

        String State[] = { "Maharastra", "Utterpradesh", "Bihar", "Rajasthan", "Gujrat", "Karnataka", "keral",
                "Telangana", "Adrapradesh", "Chattisgadh", "Talmilnadu" };

        JComboBox jcb = new JComboBox(State);
        jcb.setBounds(50, 100, 200, 40);
        add(jcb);
    }

    public static void main(String[] args) {
        new p4_JComboBox();
    }
}
