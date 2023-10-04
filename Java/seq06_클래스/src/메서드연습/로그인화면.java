package 메서드연습;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	static String checkId = "root";
	static String checkPwd = "1234";
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인화면");
		f.setSize(500, 900);
		
		JLabel top = new JLabel(); //ImageIcon을 사용할경우 JLabel로만 그림을 넣을수 있다
		JLabel pic_place1 = new JLabel();
		JLabel pic_place2 = new JLabel();
		JLabel id1 = new JLabel();
		id1.setText("ID: ");
		JLabel pwd1 = new JLabel();
		pwd1.setText("PW: ");

		JTextField id2 = new JTextField(10);
		JTextField pwd2 = new JTextField(10);
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setText("로그인");
		reset.setText("초기화");
		
		Font font = new Font("맑은 고딕",1,40);
		
		top.setFont(font);
		id1.setFont(font);
		pwd1.setFont(font);
		id2.setFont(font);
		pwd2.setFont(font);
		login.setFont(font);
		reset.setFont(font);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon pic1 = new ImageIcon("login.png"); //이미지 추가는 ImageIcon을 쓰면 편하다
		ImageIcon pic2 = new ImageIcon("reset.png");
		ImageIcon pic3 = new ImageIcon("diary.png");
		
		top.setIcon(pic3);
		pic_place1.setIcon(pic1);
		pic_place2.setIcon(pic2);
		f.add(top);
		f.add(id1);
		f.add(id2);
		f.add(pwd1);
		f.add(pwd2);
		f.add(pic_place1);
		f.add(login);
		f.add(pic_place2);
		f.add(reset);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그린 버튼 눌렀을때 실행
				String id3 = id2.getText();
				String pwd3 = pwd2.getText();
				
				if(checkId.equals(id3)&&checkPwd.contentEquals(pwd3)) {
					JOptionPane.showMessageDialog(f, "로그인성공");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
					//System.out.println("둘다 맞아요");
				}else {
					JOptionPane.showMessageDialog(f, "로그인실패");
					//System.out.println("틀려요!");
				}
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				id2.setText("");
				pwd2.setText("");
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
