package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		int[] num = new int[3];
		int i = 0;
		for (i = 0; i < 3; i++) {
			String n = JOptionPane.showInputDialog("숫자입력");
			num[i] = Integer.parseInt(n);
		}
//		System.out.println(num[i]+100);
		
		System.out.println(Arrays.toString(num)); // 배열을 String으로 변환
		
		int sum=0;
		for(int x:num) {
			sum+=x;
		}
		
		System.out.println((double)sum/3);
	}

}
