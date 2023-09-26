package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500, 700); // 창(프로그램)의 크기. 해상도 생각!
		//f.setForeground(Color.green);
		f.getContentPane().setBackground(Color.green); //프로그램의 배경은 이런식으로 해줘야한다!
		
		FlowLayout flow = new FlowLayout(); // 배치 순서
		f.setLayout(flow);
		
		JButton plus = new JButton(); // JButton은 버튼생성
		plus.setText("더하기");
		plus.setBackground(Color.blue);
		plus.setForeground(Color.white);
		JButton minus = new JButton();
		minus.setText("빼 기");
		minus.setBackground(Color.blue);
		minus.setForeground(Color.white);
		
		JLabel top = new JLabel();
		ImageIcon icon = new ImageIcon("pic1.PNG");
		top.setIcon(icon);
		
		JLabel l1 = new JLabel(); //JLabel은 글자추가하는 명령어이다
		l1.setText("숫자1");
		l1.setForeground(Color.blue);
		JTextField t1 = new JTextField(10); // JTextField는 글자입력 명령어이다
		t1.setBackground(Color.yellow); // 배경색
		t1.setForeground(Color.white); // 글자색
		
		JLabel l2 = new JLabel();
		l2.setForeground(Color.blue);
		l2.setText("숫자2");
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.yellow); // 배경색
		t2.setForeground(Color.white); // 글자색
		
		f.add(top);
		f.add(l1);	// add를 통해 화면에 올려놓는다.
		f.add(t1);	// 이때 위에서 정한 순서대로 배열된다
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		
		Font font = new Font("볼드",1,30); // Font(글자체,진하게여부,글자크기)
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		
		f.setVisible(true); // setVisible을 통해 화면에 보여줘야한다(안하면 안보임)
	}

}
