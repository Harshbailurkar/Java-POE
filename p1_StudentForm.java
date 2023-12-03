// 1. Program for student registration form

import java.awt.*;

public class p1_StudentForm extends Frame {
    p1_StudentForm() {

        setVisible(true);
        setLayout(null);
        setSize(400, 1000);

        Label l1 = new Label("Student Registration Form");
        l1.setBounds(120, 30, 150, 30);
        add(l1);
        // ----- ----------------------------------------------------------

        Label l2 = new Label("Name of Student");
        l2.setBounds(40, 90, 90, 30);
        add(l2);
        TextField t1 = new TextField(40);
        t1.setBounds(150, 90, 200, 20);
        add(t1);

        // ---------------------------------------------------------------

        Label l3 = new Label("Address");
        l3.setBounds(40, 130, 60, 30);
        add(l3);
        TextArea t2 = new TextArea();
        t2.setBounds(150, 130, 200, 70);
        add(t2);

        // -----------------------------------------------------------------

        Label l4 = new Label("Gender");
        l4.setBounds(40, 210, 60, 30);
        add(l4);
        CheckboxGroup chg1 = new CheckboxGroup();
        Checkbox Male = new Checkbox("Male", chg1, true);
        Male.setBounds(110, 210, 70, 30);
        Checkbox Female = new Checkbox("Female", chg1, false);
        Female.setBounds(190, 210, 70, 30);
        add(Male);
        add(Female);
        // -----------------------------------------------------------------

        Label l5 = new Label("Branch");
        l5.setBounds(40, 250, 40, 30);
        add(l5);
        Choice bch = new Choice();
        bch.setBounds(100, 250, 180, 30);
        bch.add("Mechanical Engineering");
        bch.add("Computer Science and Engineering");
        bch.add("Artificial Inteligence and DataScience");
        bch.add("Electeical Engineering");
        bch.add("Eletronics and computer Science");
        add(bch);

        // --------------------------------------------------------

        Label l6 = new Label("Subjects");
        l6.setBounds(40, 300, 40, 30);
        add(l6);
        List list1 = new List(2, true);
        list1.setBounds(100, 300, 180, 60);
        list1.add("Java Advance");
        list1.add("Software engineering");
        list1.add("Compiler Designing");
        list1.add("Robotics");
        add(list1);
        // ---------------------------------------------------------------

        Button b1 = new Button("Save");
        b1.setBounds(160, 370, 60, 40);
        Color c1 = new Color(255, 215, 0);
        b1.setBackground(c1);
        add(b1);
        Color c2 = new Color(50, 150, 50);
        setBackground(c2);
    }

    public static void main(String args[]) {
        new p1_StudentForm();
    }
}
