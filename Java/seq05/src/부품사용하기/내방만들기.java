package 부품사용하기;

import 부품만들기.강아지; //다른 클래스에서 가져오기
import 부품만들기.전화기; //가져올때는 패키지.클래스 이런식으로 가져온다

public class 내방만들기 {

	public static void main(String[] args) {
		전화기 phone = new 전화기(); //가져온 클래스를 메모리에 올려서 사용한다
		강아지 dog = new 강아지();
		phone.카톡하다(); //해당 클래스에 있는 함수명을 호출해서 그 기능을 사용
		phone.인터넷하다();
		dog.귀엽다();
	}

}