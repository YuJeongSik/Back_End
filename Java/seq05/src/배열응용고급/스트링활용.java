package 배열응용고급;

import java.util.Arrays;

public class 스트링활용 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		System.out.println(Arrays.toString(s2));
		System.out.println(s2.length);
		System.out.println(s2[0]);
		
		String s3 = "	홍길동";
		System.out.println(s3.trim()); //trim은 공백을 없애는 함수
		s3 = s3.replace("	", ""); //trim은 공백을 없애지만 보여줄때만 없애는것이다
		System.out.println(s3); //따라서 공백을 완전히 삭제하고싶으면 replace로 없애줘야한다
	
		String s6 = "홍길동";
		char c6 = s6.charAt(0); //charAt은 인덱스에 해당하는 글자 가져오는 함수
		if (c6=='홍') { //기본형은 연산자로 비교 가능! String비교는 equals사용
			System.out.println("홍씨 가문이시군요");
		} else {
			System.out.println("홍씨 가문이 아니시군요");			
		}
	}

}
