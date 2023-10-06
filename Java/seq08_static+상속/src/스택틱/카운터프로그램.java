package 스택틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 카운터프로그램 {
	
	public static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(400, 300);
		
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout()); //한번만 쓰이는 경우에는 이런식으로도 가능!
		
		JButton plus = new JButton("1더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1빼기");
		JButton number = new JButton("0");
		number.setForeground(Color.red);
		
		Font font = new Font("맑은 고딕",Font.BOLD,20);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);
		number.setFont(new Font("맑은 고딕",Font.BOLD,100));
		
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count=0;
				number.setText(String.valueOf(count));
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(String.valueOf(count));
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
