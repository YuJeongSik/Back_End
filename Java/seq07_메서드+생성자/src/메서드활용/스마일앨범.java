package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스마일앨범 {

	public static int start = 0;
	
	public static void main(String[] args) {
		
		String[] title = {"콘크리트", "밀수", "레지던트", "노크", "귀주"};
		String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		double[] jumsu = {11.1, 22.2, 33.3, 44.4, 55.5};
	
		JFrame f = new JFrame("나의 영화앨범");
		f.setSize(400,400);
		f.setTitle("와오");
		
		ImageIcon icon = new ImageIcon(img[0]);
		
		JLabel top = new JLabel(title[0]);
		JLabel center = new JLabel();
		center.setIcon(icon);
		
		JLabel under = new JLabel(String.valueOf(jumsu[0]));
		
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");
				
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		top.setFont(font);
		under.setFont(font);
		
		f.add(top, BorderLayout.NORTH); //BorderLayout으로 위치를 조정할 수 있다
		f.add(left, BorderLayout.WEST);
		f.add(center, BorderLayout.CENTER);
		f.add(right, BorderLayout.EAST);
		f.add(under, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.green);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(start>0) {
					start--;
					top.setText(title[start]);
					under.setText(String.valueOf(jumsu[start]));
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "가장 처음페이지입니다");
				}
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(start<4) {
					start++;
					top.setText(title[start]);
					under.setText(String.valueOf(jumsu[start]));
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "가장 마지막페이지입니다");
				}
			}
		});
		
		f.setVisible(true);
	}

}
