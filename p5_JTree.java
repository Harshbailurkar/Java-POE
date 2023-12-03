//5. Write a program for Jtree 

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class p5_JTree extends JFrame {
    p5_JTree() {

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Country");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("Bangladesh");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode aa1 = new DefaultMutableTreeNode("Sangli");
        DefaultMutableTreeNode aaa2 = new DefaultMutableTreeNode("Miraj");
        DefaultMutableTreeNode aa2 = new DefaultMutableTreeNode("Uttar Pradesh");
        DefaultMutableTreeNode district1 = new DefaultMutableTreeNode("Allahabad");
        DefaultMutableTreeNode district2 = new DefaultMutableTreeNode("Lucknow");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Delhi");
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Dhaka");

        a.add(a1);
        a.add(aa2);
        a1.add(aa1);
        aa1.add(aaa2);
        aa2.add(district1);
        aa2.add(district2);
        a.add(a2);
        b.add(b1);
        root.add(a);
        root.add(b);

        JTree j = new JTree(root);
        add(j);
    }

    public static void main(String[] args) {
        new p5_JTree();
    }
}
