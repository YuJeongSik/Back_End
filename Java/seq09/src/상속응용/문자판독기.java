package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 문자판독기 extends JFrame{
	
	JLabel ch, words, chCount, wordsCount;
	JTextArea area;
	JButton b1, b2, b3;
	
	
	public 문자판독기() {
		setTitle("문자판독기");
		setSize(500,500);
		
		ch = new JLabel("문자수: ");
		words = new JLabel("단어수: ");
		chCount = new JLabel("문자수 결과 들어갈 자리");
		wordsCount = new JLabel("단어수 결과 들어갈 자리");
		
		area = new JTextArea(5,10);
		
		b1 = new JButton("글자수카운트");
		b2 = new JButton("배경색변경");
		b3 = new JButton("글자색변경");
		
		setLayout(new FlowLayout());
		
		add(ch);
		add(chCount);
		add(words);
		add(wordsCount);
		add(area);
		add(b1);
		add(b2);
		add(b3);
		
		Font font = new Font("맑은 고딕",Font.BOLD,35);
		ch.setFont(font);
		chCount.setFont(font);
		words.setFont(font);
		wordsCount.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		area.setBackground(Color.yellow);
		area.setForeground(Color.blue);
		
		getContentPane().setBackground(Color.green);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = area.getText();
				int num = s.length();
				
				String[] s2 = s.split(" ");
				int num2 = s2.length;
				
				chCount.setText(String.valueOf(num));
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		문자판독기 name = new 문자판독기();
	}

}
