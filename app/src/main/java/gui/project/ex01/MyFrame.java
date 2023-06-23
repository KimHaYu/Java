package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    JButton b1, b2;

    public MyFrame() {
        setTitle("Absolute position Test");
        setSize(300, 150);
        setLayout(null);// (1)

        b1 = new JButton("Button #1");
        add(b1);// (2)
        b1.setLocation(50, 30);// (3)
        b1.setSize(90, 50);

        b2 = new JButton("Button #2");
        add(b2);
        b2.setBounds(180, 30, 90, 20);// (3)
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] arges) {
        MyFrame f = new MyFrame();
    }
}