
import java.awt.*;

class Harsh2 extends Frame {
    Harsh2() {
        setSize(400, 400);
        setVisible(true);
        GridLayout obj = new GridLayout(5, 5);
        setLayout(obj);
        setTitle("Harsh Frame 2");

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
        Harsh2 obj = new Harsh2();
    }

}