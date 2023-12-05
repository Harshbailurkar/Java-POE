import java.awt.*;
import java.awt.event.*;

public class p7_KeyPressed extends Frame implements KeyListener {
    Label l;
    TextArea area;

    p7_KeyPressed() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
        System.out.println("Key Pressed.....");
    }
    public void keyReleased(KeyEvent e){
        System.out.println("key Released");
    }
    public void keyTyped(keyEvent e){
        System.out.println("key Typed");
    }

    public static void main(String[] args) {
        new p7_KeyPressed();
    }
}
