//6. Write a program for Jtable

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class p6_JTable extends JFrame {
    String column[] = { "ID", "NAME", "SALARY" };
    String row[][] = {
            { "01", "Harsh", "40000" },
            { "02", "Harsh1", "45000" },
            { "03", "harsh2", "50000" }
    };

    JTable jta = new JTable(row, column);
    JScrollPane sp = new JScrollPane(jta);

    p6_JTable() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(sp);
    }

    public static void main(String[] args) {
        new p6_JTable();
    }
}
