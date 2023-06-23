package gui.project.ex02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.border.Border;

// 1.이벤트 소스

public class Event09 extends MyFrame {

    private JButton btn1, btn2;

    public Event09() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        btn1.addActionListener(e -> System.out.println("버튼1이 클릭됨"));
        btn2.addActionListener(e -> System.out.println("버튼2가 클릭됨"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new Event09();
    }
}
