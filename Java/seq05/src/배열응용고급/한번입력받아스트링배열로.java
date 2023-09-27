package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 한번입력받아스트링배열로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		String[] data2 = data.split(",");
		System.out.println(Arrays.toString(data2));
		int cloud=0, sky=0;
		for (String x : data2) {
			if(x.equals("흐림")) {
				cloud++;
			}else {
				sky++;
			}
		}
		System.out.println(cloud+" "+sky);
	}

}
