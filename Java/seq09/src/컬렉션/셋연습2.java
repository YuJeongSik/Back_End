package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class 셋연습2 {

	public static void main(String[] args) {
		HashSet lotto = new HashSet();
				
		Random r = new Random();
		for (int i = 0; lotto.size()!=6; i++) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto);
	}

}
