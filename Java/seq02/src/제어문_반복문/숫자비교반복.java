package 제어문_반복문;

import java.util.Scanner;

public class 숫자비교반복 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("첫번째 숫자를 입력해주세요: ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력해주세요: ");
			int num2 = sc.nextInt();
			if (num1 > num2) {
				System.out.println(num1 + "이 더 큽니다");
			} else if (num1 == num2) {
				System.out.println("둘이 숫자가 같습니다");
			} else {
				System.out.println(num2 + "이 더 큽니다");
			} 
			
			System.out.print("계속 하시겠습니까? (네,아니오): ");
			String answer = sc.next();
			if(answer.equals("아니오")) {
				System.exit(0);
			}
		}

	}

}
