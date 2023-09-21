package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.*;

public class 화면만들기2 {

	public static void main(String[] args) {
		
		
		// 한번에 import해주는 단축키 > ctrl + shift + o
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b = new JButton();
		b.setText("############ 나를 눌러요 ###########");
		
		JTextField t1 = new JTextField(20);		
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		FlowLayout flow = new FlowLayout();
		
		JLabel l1 = new JLabel();
		l1.setText("이름");
		JLabel l2 = new JLabel();
		l2.setText("나이");
		JLabel l3 = new JLabel();
		l3.setText("취미");
		
		f.setLayout(flow);	//이렇게 순서대로 쓰는 이유
		f.add(b);			//순차적으로 진행되기 때문!
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.setVisible(true);

	}

}
