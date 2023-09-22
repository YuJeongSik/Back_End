package 제어문_조건문;

import java.util.Date;

public class Date확인문제 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int now_year = date.getYear();
		int now_day = date.getDay();
		
		if(now_year<1900) {
			System.out.println("밀레니엄 세대군요");
		}
		else {
			System.out.println("밀레니엄 세대가 아니군요");
		}
		
		if(now_day==6 && now_day==0) {
			System.out.println("쉬자~~~~~~~~~~~");
		}
		else {
			System.out.println("열심히 공부하자");
		}
		
		int month = date.getMonth() + 1;
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
		}
	}

}
