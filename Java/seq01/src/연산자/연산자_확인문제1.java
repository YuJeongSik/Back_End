package 연산자;
import javax.swing.JOptionPane;

public class 연산자_확인문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char pw='p';
		String input=JOptionPane.showInputDialog("암호를 입력하세요");
		
		char inputCheck=input.charAt(0);
		
		if(pw==inputCheck) {
			JOptionPane.showMessageDialog(null, "PASS!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "재입력!!");
		}
		
		//float today=parseInt(JOptionPane.showInputDialog("오늘의 몸무게는?"));
		//float yesterday=parseInt(JOptionPane.showInputDialog("어제의 몸무게는?"));
		//위 코드를 float형으로 쓸려면 우선 Double.parseDouble을 이용해야한다
		//float today=(float) Double.parseDouble(JOptionPane.showInputDialog("오늘의 몸무게는?"));
		
		double today=4.2;
		double yesterday=2;
		
		if(today-yesterday>2) {
			JOptionPane.showMessageDialog(null, "성공!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "실패!!!");
		}
		
		if(pw==inputCheck && today-yesterday>2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!!!");
		}
	}
}
