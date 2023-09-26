package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		int[] s = new int[5];
		// 초기화를 하지 않았을경우 0으로 초기화된다		
		
		int[] s2 = {1, 2, 3, 4, 5};
		
		System.out.println(s.length);
		System.out.println(s2.length);
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[4]);
		System.out.println(s[s.length-1]); // 위랑 이거랑 똑같은 결과가 나온다
		
		

	}

}
