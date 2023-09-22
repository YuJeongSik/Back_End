package 제어문_조건문;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour+"시 "+min+"분 "+sec+"초");
		
		int year = date.getYear()+1900; //년은 꼭 1900을 더해줘야한다
		int month = date.getMonth()+1; //월은 꼭 1을 더해줘야한다
		int today = date.getDate();
		System.out.println(year+" "+month+" "+today);
		
		int day = date.getDay();
		System.out.println(day); //요일 0~6, 0이 일요일
	}

}
