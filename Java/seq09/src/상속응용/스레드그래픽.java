package 상속응용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame{

	JLabel count, image, day;
	
	public 스레드그래픽() {
		setTitle("나의 pc방 모니터링 서비스");
		setSize(800,300);
		count = new JLabel("카운터 들어가는 자리");
		image = new JLabel();
		day = new JLabel("시간 자리들어가는 자리");
		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		count.setFont(font);
		image.setFont(font);
		day.setFont(font);
		
		add(count,BorderLayout.WEST);
		add(image,BorderLayout.EAST);
		add(day,BorderLayout.SOUTH);
		//JFrame은 기본적으로 BorderLayout으로 설정되어있다
		//동서남북 가운데만 넣을수 있다
		
		카운터스레드 counter = new 카운터스레드();
		시각스레드 timer = new 시각스레드();
		배열스레드 array = new 배열스레드();
		
		counter.start(); //스레드 시작
		timer.start();
		array.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		스레드그래픽 name = new 스레드그래픽();
	}
	//클래스안에 클래스를 끼워넣을수 있다
	//전역변수를 사용하기 위해서!
	//클래스안에 끼워넣은 클래스를 안쪽클래스(inner클래스)라고 한다.
	public class 카운터스레드 extends Thread{

		public void run() {
			for (int i = 500; i >= 0; i--) {
				count.setText("카운터>> "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class 배열스레드 extends Thread {

		public void run(){
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int i = 0; i < list.length; i++) {
				//image.setText("이미지>> "+list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				if(i==4) {
					i = -1;
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class 시각스레드 extends Thread{

		public void run() {
			for (int i = 500; i >= 0; i--) {
				Date date = new Date();
				day.setText(date+"");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
