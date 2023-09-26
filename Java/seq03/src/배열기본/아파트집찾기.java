package 배열기본;

public class 아파트집찾기 {

	public static void main(String[] args) {
		int[] s={10, 15, 20, 10};
		System.out.println("배열이 들어있는 주소: "+s);
		System.out.println(s.length); 
		
		int[] s2 = {1, 2, 3};
		//배열의 끝에는 항상 length가 저장되어있다. 따라서 위 배열은 16바이트이다.
		//단 length는 int로 저장되어있는것이다
	}

}
