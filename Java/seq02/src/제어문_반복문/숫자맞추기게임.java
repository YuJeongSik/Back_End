package 제어문_반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(99) + 1; 
		//랜덤은 0~해당숫자까지이다. 따라서 1부터 원할경우 +1을 꼭 해야한다
		int total = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력");
			//데이터 타입이 동일해야 비교 가능
			int data2 = Integer.parseInt(data);
			//cpu가 ram에 들어있는 값을 가져다가 1을 증가시키고 다시 램에 넣는다
			total++;
			if (target == data2) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				System.out.println("전체시도횟수>> " + total);
				System.exit(0);
			} else {
				System.out.println("정답이 아닙니다. ");
				if (target < data2) {
					System.out.println("정답보다 커요!");
				} else {
					System.out.println("정답보다 작아요!");
				}
			} 
		}
	}

}