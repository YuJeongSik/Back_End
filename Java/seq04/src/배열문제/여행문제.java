package 배열문제;

import java.util.Scanner;

public class 여행문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3]; // 작년에 가고싶은장소 저장
		String[] arr2 = new String[3]; // 올해 가고싶은장소 저장
		//int[] arr3 = new int[3]; // 작년과 올해 같은경우 인덱스 저장용 배열
		int[] arr3 = {3,3,3};
		int ans = 0; // 같은경우 카운트
		
		System.out.print("작년에 가고싶은 장소 3개를 입력해주세요: ");
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextLine();
		}
		
		System.out.print("올해에 가고싶은 장소 3개를 입력해주세요: ");
		for (int i = 0; i < 3; i++) {
			arr2[i] = sc.nextLine();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr[i].equals(arr2[j])) {
					ans++;
					arr3[i] = i;
				}
			}
		}
		
		System.out.println("작년과 같은장소의 개수는  "+ans);
		System.out.print("작년과 같은 장소는 ");
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i]!=3) {
				System.out.print(arr[i]+" ");
			}
		}	
	}
}
