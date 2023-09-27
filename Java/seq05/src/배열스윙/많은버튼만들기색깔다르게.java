package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 많은버튼만들기색깔다르게 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

//		Container c = f.getContentPane(); //Container
//		c.setBackground(Color.green);

		f.getContentPane().setBackground(Color.green);
		// 체인식 코드(편하기 때문에 사용 가능)

		JButton[] buttons = new JButton[500];
		// {null, null, null, null, null, ......}
		// buttons[0], buttons[1]

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}

		Random r = new Random();
		Color[] colors = {Color.red, Color.yellow, Color.pink};
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1500); 
			int y = r.nextInt(1000);
			int index = r.nextInt(3); //0,1,2
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(colors[index]); //for가 반복될때마다 index에 매번 다른 숫자가 들어감
			f.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//e는 해당 이벤트가 실행될때를 나타낸다. 여기서는 버튼을 눌렀을때
					String s = e.getActionCommand();//버튼에 있는 글자를 가져오는 함수
					JOptionPane.showMessageDialog(f, s+"번을 클릭하셨군요");
				}
			});
		}
		// 맨 마지막으로!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
} 