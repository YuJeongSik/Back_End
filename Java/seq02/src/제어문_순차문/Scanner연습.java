package 제어문_순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//new로 자동완성하고 빨간 밑줄이 생기면 import를 안해서 생긴 문제!
		System.out.print("이름입력: ");
		String name = sc.next(); //String으로 입력한 값을 가지고 들어온다
		System.out.println("당신의 이름은 "+name);
		
		System.out.print("나이입력: ");
		int age = sc.nextInt(); //모든 입력은 String이지만 nextInt()는 입력을 int로 받는다
		System.out.println("당신의 내년 나이는 "+(age+1));
		
		System.out.println("몸무게 입력: ");
		double w = sc.nextDouble();
		System.out.println("당신의 몸무게는 "+(w-10));
	}

}
