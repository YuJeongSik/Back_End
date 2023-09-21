package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 이름은" + name + "이군요");

		// showMessageDialog : 팝업창에 내용 출력
		// showInputDialog : 팝업창으로 부터 값 입력 받기
		// showOptionDialog : 선택사항을 통해 입력 받기
		// OptionType : 옵션 종류 지정
		// messageType : 아이콘
		// initialValue : 디폴트 옵션값 선택
	}
}
