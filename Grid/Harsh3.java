
import java.awt.*;

class Harsh3 extends Frame {
    Harsh3() {
        setSize(400, 400);
        setVisible(true);
        GridBagLayout obj = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        GridBagLayout obj3 = new GridBagLayout();
        this.setLayout(obj3);
        setLayout(obj);
        setTitle("Harsh Frame 3");
        gc.gridx = 0;
        gc.gridy = 0;

        Button b = new Button("Button1");
        add(b, gc);
        gc.gridx = 1;
        gc.gridy = 0;
        Button b1 = new Button("Button2");
        add(b1, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        Button b2 = new Button("Button3");
        add(b2, gc);
        gc.gridx = 1;
        gc.gridy = 1;
        Button b3 = new Button("Button4");
        add(b3, gc);
    }

    public static void main(String[] args) {
        Harsh3 h1 = new Harsh3();
    }

}