package gui.project.ex02;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest3 extends JFrame implements ActionListener {
    // MyFrame 클래스는 JFrame 클래스르 상속받고 동시에 ActionListner를 구현한다.
    // 따라서 프레임이 버튼에서 발생하는 이벤트도 처리할 수 있다.
    private JButton button;
    private JLabel label;
    int counter = 0;

    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터값: " + counter);
    }

    public EventTest3() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값:" + counter);
        button.addActionListener(this); // 현재 객체를 이번트 리스너로 버튼에 등록한다.즉 자기 자신이 이벤트를 처리한다고 등록한다.
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        EventTest3 t = new EventTest3();
    }

}
