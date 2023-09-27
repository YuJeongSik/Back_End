package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화좌석예매 {

	static int count = 0;
	static String no = "";
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1000);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.getContentPane().setBackground(Color.green);

		JButton[] buttons = new JButton[500];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			//buttons[i].setText("" + i);
			buttons[i].setText(String.valueOf(i)); //int를 String으로 바꾸는 방법
		}

		Random r = new Random();
		Color[] colors = {Color.red, Color.yellow, Color.pink};
		for (int i = 0; i < buttons.length; i++) {
			int index = r.nextInt(3); //0,1,2
			buttons[i].setBackground(colors[index]); //for가 반복될때마다 index에 매번 다른 숫자가 들어감
			f.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					//e는 해당 이벤트가 실행될때를 나타낸다. 여기서는 버튼을 눌렀을때
					String s = e.getActionCommand();//버튼에 있는 글자를 가져오는 함수
					no = no+s+" "; // String도 이런식으로 사용 가능하다.
					int pay = count*10000;
					JOptionPane.showMessageDialog(f, s+"번을 클릭하셨군요. 현재 결제금액은 "+pay+"원입니다. 좌석번호는 "+no+"입니다.");
				
					JButton b = (JButton)e.getSource(); //누른버튼 비활성화
					b.setBackground(Color.blue);
					b.setEnabled(false);
				}
			});
		}
		// 맨 마지막으로!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
} 