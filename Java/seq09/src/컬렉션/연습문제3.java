package 컬렉션;

import java.util.ArrayList;

public class 연습문제3 {

	public static void main(String[] args) {
		ArrayList doing = new ArrayList();
		
		doing.add("밥먹기");
		doing.add("공부하기");
		doing.add("게임하기");
		doing.add("잠자기");
		doing.add("놀기");
		
		System.out.println(doing);
		
		System.out.println(doing.get(0));
		System.out.println(doing.get(doing.size()-1));
		doing.set(1, "운동하기");
		System.out.println(doing);
	}

}
