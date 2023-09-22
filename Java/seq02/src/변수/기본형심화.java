package 변수;

public class 기본형심화 {

	public static void main(String[] args) {
		//기본형 데이터 4가지 ==> 값을 변수에 바로 넣는다. 원시타입
		//정수, 실수, 문자1, 논리
		//정수 4가지(byte, short, int, long)
		//실수 2가지(float, double)
		byte age = 127; //+-127(-128~127), 1byte(8비트)
		//byte age2= 128;
		short wallet = 25000; //+-3만, 2byte
		int money = 200000000; //+-21억, 4byte
		long space = 20000000000L; //21억이상, 8byte
		//long을 쓰기 위해선 뒤에 L을 붙여줘야한다. 인터프리터는 따로 지정을 안할시 정수는 int로 인식하기 때문(자바만!)
		
		
		float weight = 88.8f;
		//float도 사용시 뒤에 f를 꼭 써줘야한다.(자바만!)
		double height = 185.50000000000;
		//모두 int로 했을 때와 메모리 크기 비교!
		

	}

}