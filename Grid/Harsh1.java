import java.awt.*;

class Harsh1 extends Frame {
    Harsh1() {
        setSize(500, 500);
        setVisible(true);
        BorderLayout obj = new BorderLayout(20, 20);
        setLayout(obj);
        setTitle("Harsh Frame 1");

        Button b = new Button("North");
        add(b, obj.NORTH);
        Button b1 = new Button("South");
        add(b1, obj.SOUTH);
        Button b2 = new Button("East");
        add(b2, obj.EAST);
        Button b3 = new Button("West");
        add(b3, obj.WEST);
        Button b4 = new Button("Centre");
        add(b4, obj.CENTER);

    }

    public static void main(String[] args) {
        Harsh1 obj = new Harsh1();
    }

}
