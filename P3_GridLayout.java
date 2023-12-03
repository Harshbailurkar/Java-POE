// 2.  Write a program for grid of 5*5

import java.awt.*;

public class P3_GridLayout extends Frame {

    P3_GridLayout() {
        setVisible(true);
        setSize(400, 400);
        GridLayout gl = new GridLayout(5, 5);
        setLayout(gl);
        Label l1 = new Label("Name");
        add(l1);
        TextField t1 = new TextField();
        add(t1);
        Label l2 = new Label("PRN no.");
        add(l2);
        TextField t2 = new TextField();
        add(t2);
        Label l3 = new Label("Username");
        add(l3);
        TextField t3 = new TextField();
        add(t3);
        Label l4 = new Label("Password");
        add(l4);
        TextField t4 = new TextField();
        add(t4);
        Button b = new Button("Login");
        add(b);
        Button b1 = new Button("Clear");
        add(b1);
    }

    public static void main(String[] args) {
        new P3_GridLayout();
    }
}
