package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤값1000 {

	public static void main(String[] args) {
		int[] arr = new int[1000]; // {0,0,0,0,..}
		Random r = new Random(18);
		//값을 넣기위한 반복문 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000); //0~999(1000)
		}
		System.out.println(Arrays.toString(arr));
		
		//int count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		int[] count = new int[4]; //{0,0,0,0}
		//값을 꺼내기위한 반복문 
		for (int i = 0; i < arr.length; i++) {
			//555
			if(arr[i] >= 600) {
				//count6++;
				count[3]++;
			}else if (arr[i] >= 500) {
				//count5++;
				count[2]++;
			}else if (arr[i] >= 400) {
				//count4++;
				count[1]++;
			}else if (arr[i] >= 300) {
				//count3++;
				count[0]++;
			}
		}
//		System.out.println(
//					count3 + " " + 
//					count4 + " " + 
//					count5 + " " + 
//					count6 + " "  
//		);
		System.out.println(Arrays.toString(count));
	}
}

