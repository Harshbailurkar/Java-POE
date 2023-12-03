//3. Write a program for BorderLayout

import java.awt.*;

public class p2_BorderLayout extends Frame {
    p2_BorderLayout() {
        setSize(600, 600);
        setVisible(true);
        BorderLayout bl = new BorderLayout(20, 20);
        setLayout(bl);
        setTitle("Harsh BorderLayout");

        Button b1 = new Button("North");
        add(b1, bl.NORTH);
        Button b2 = new Button("South");
        add(b2, bl.SOUTH);
        Button b3 = new Button("East");
        add(b3, bl.EAST);
        Button b4 = new Button("West");
        add(b4, bl.WEST);
        Button b5 = new Button("Center");
        add(b5, bl.CENTER);
    }

    public static void main(String[] args) {
        new p2_BorderLayout();
    }
}
