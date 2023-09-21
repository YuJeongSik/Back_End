package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 화면만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		// 위치를 지정하지 않으면 모두 중앙에 배치된다
		// 이럴경우 마지막꺼만 보이게 된다 
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		b.setText("나의 정보 확인");
		
		f.add(b); //f에 b을 올리라는 명령어
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.setVisible(true); // 순서대로 실행되기때문에 setVisible은 마지막에 둬야한다!
	}

}
