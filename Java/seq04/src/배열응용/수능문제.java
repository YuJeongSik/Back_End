package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] score = new int[10000];
		int count_1 = 0;
		int count_2 = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = r.nextInt(450)+1;
			
			if(score[i]==450) {
				//System.out.println(i);
				count_1++;
			}
			else if(score[i]==1) {
				count_2++;
			}
		}
		int sum = 0;
		for (int x:score) {
			sum+=x;
		}
		System.out.println("평균은 "+(double)sum/score.length);
		System.out.println("만점자는 "+count_1+"명 입니다");
		System.out.println("1점은 "+count_2+"명 입니다");
		
		//Arrays.sort(score); // 배열을 오름차순으로 정렬
	}

}
