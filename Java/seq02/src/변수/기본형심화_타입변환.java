package 변수;

public class 기본형심화_타입변환 {

	public static void main(String[] args) {
		byte age=127;
		int age2=age; //(문제없음. 작은거에서 큰거로 넣는건 괜찮음)

		int age3=127;
		byte age4=(byte)age3; //(에러발생.큰거에서 작은거로 넣는건 에러가 발생!)
		//이경우 강제형변환을 해주어야한다
	}

}
