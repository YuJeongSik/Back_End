package 제어문_조건문;

import java.util.Scanner;

public class 조건문_확인문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고싶은 음식 입력: ");
		String menu = sc.next();
		
		switch (menu) {
		case "짜장면":
			System.out.println("중국집으로");
			break;
		case "라면":
			System.out.println("분식집으로");
			break;
		case "회":
			System.out.println("횟집으로");
			break;
		default:
			System.out.println("안먹음");
			break;
		}

	}

}
