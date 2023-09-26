package 배열응용;

import java.util.Random;
import java.util.Arrays;

public class 랜덤평균 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n2 = new int[1000];
		int sum=0;
		
		for(int i=0; i<1000; i++) {
			n2[i] = r.nextInt(100);
			sum+=n2[i];
		}
		System.out.println((double)sum/1000);
	}

}
