package 배열스윙;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,500);
		f.setTitle("나의 버튼들");
		f.setLayout(null);

		Random r = new Random();
		
		JButton[] buttons = new JButton[200];
		
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(800);
			int y = r.nextInt(500);
			buttons[i] = new JButton(); //이런식으로 버튼을 여러개 만들수도 있다
			buttons[i].setText("버튼"+i);
			buttons[i].setBounds(x, y, 100, 100); // setBounds는 위치를 지정해준다
			//(가로위치, 세로위치, 가로크기, 세로크기)
			buttons[i].setBackground(Color.yellow);
			buttons[i].setForeground(Color.red);
			f.add(buttons[i]);
		}
		
		
				
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
