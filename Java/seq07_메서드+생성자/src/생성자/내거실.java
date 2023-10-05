package 생성자;

import 부품만들기.TV;

// jar로 만들어진 파일을 java build path를 활용해 다른 프로젝트에 있는 패키지 및 클래스를 사용할 수 있다

public class 내거실 {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.ch = 5;
		tv.onOff = false;
		tv.vol = 100;
		
		System.out.println(tv);
		
		TV2 tv2 = new TV2(6, 200, true);
		System.out.println(tv2);
	}
}
