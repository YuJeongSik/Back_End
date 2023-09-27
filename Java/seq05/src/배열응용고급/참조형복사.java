package 배열응용고급;

import java.util.Arrays;

public class 참조형복사 {

	public static void main(String[] args) {
		int[] n1 = {100,200,300};
		int[] n2 = n1; //주소값을 복사한다
		int[] n3 = n1.clone(); //주소가 가르키는 값들의 목록을 복사
		System.out.println(n1); //배열은 그냥 출력하면 주소값을 알려준다
		System.out.println(n2); //따라서 둘다 같은 주소값이 나온다
		System.out.println(n3); //주소가 다름. 주소가 아닌 새로운 배열을 만든것이기때문
		
		n2[0]=999;
		System.out.println(Arrays.toString(n1)); //배열을 출력하려면 toString을 사용해야한다!
		System.out.println(Arrays.toString(n2)); //이때 String 형태로 출력한다
	
		n3[0]=888;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n3));
	}

}
