package 컬렉션;

import java.util.LinkedList;

public class 큐연습1 {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.add("국어");
		link.add("수학");
		link.add("영어");
		link.add("컴퓨터");
		
		System.out.println(link);
		for (int i = 0; i < 3; i++) {
			link.remove();
			System.out.println(link);
		}
	}

}
