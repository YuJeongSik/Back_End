package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class 셋연습1 {

	public static void main(String[] args) {
		ArrayList lotto = new ArrayList();
		
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto);
	}

}
