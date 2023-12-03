import java.awt.*;
import java.awt.event.*;

public class p9_mouseDragged extends Frame implements MouseMotionListener {
    p9_mouseDragged() {
        addMouseMotionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }

    public static void main(String[] args) {
        new p9_mouseDragged();
    }
}
