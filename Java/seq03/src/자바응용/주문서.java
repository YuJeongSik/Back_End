package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 주문서 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,500);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("짬뽕");
		b1.setBackground(Color.yellow);
		JButton b2 = new JButton();
		b2.setText("우동");
		b2.setBackground(Color.magenta);
		JButton b3 = new JButton();
		b3.setText("짜장");
		b3.setBackground(Color.blue);
		
		JLabel l1 = new JLabel();
		l1.setText("개수: 0개");
		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("pic1.PNG");
		l2.setIcon(icon);
		JLabel l3 = new JLabel();
		l3.setText("결재 금액");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.setVisible(true);
	}

}
