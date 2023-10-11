package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 연습문제1 {

	public static void main(String[] args) {
		HashSet hash = new HashSet();
		String[] place = {"인천","서울","경기도","강원도","충청도","전라도","경상도","부산"};
		
		Random r = new Random();
		for (int i = 0; hash.size()!=5; i++) {
			hash.add(place[r.nextInt(8)]);
		}
		System.out.println(hash);
	}

}
