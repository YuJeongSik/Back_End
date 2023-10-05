package 메서드기본;

import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		//메서드 이름이 하나로 똑같다.
		//입력형태가 다양하다.
		//하나의 이름으로 여러형태를 만들 수 있다. 
		//다형성(오버로딩) 제공 
		//입력값의 순서와 타입, 개수를 가지고 구분 
		int total = cal2.add(300, 200); // 해당하는 타입으로 가서 실행하게된다
		System.out.println(total);
		double total2 = cal2.add(300, 11.2);
		System.out.println(total2);
		
		System.out.println(cal2.add(11.1, 22.2));
		
		double total3 = cal2.add(100, 200) + cal2.add(100, 22.2);
		//int와 double을 돌려받기 때문에 double로 변수를 저장해준다
		System.out.println(total3);
		
		int[] total4 = cal2.add(); //return 받는 타입과 변수에 저장하는 타입이 동일해야한다!
		System.out.println(total4[0]+100);
		
		Random r =new Random();
		int x = r.nextInt();
		double y = r.nextInt(100); // double은 8바이트라 4바이트인 int를 받을수 있다
	}

}