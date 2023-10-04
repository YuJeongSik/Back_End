package 부품사용하기;

import 부품만들기.계좌;

public class 은행 {

	public static void main(String[] args) {
		
		계좌 아버지 = new 계좌();
		아버지.이름 = "홍길동";
		아버지.계좌이름 = "튼튼적금";
		아버지.금액 = 10000;
		
		계좌 어머니 = new 계좌();
		어머니.이름 = "홍길동";
		어머니.계좌이름 = "튼튼예금";
		어머니.금액 = 20000;
		
		계좌 형 = new 계좌();
		형.이름 = "홍길동";
		형.계좌이름 = "다음적금";
		형.금액 = 30000;
		
		System.out.println(아버지);
		System.out.println(어머니);
		System.out.println(형);
	}

}
