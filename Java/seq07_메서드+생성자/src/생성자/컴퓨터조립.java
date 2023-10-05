package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		
		컴퓨터 com1 = new 컴퓨터(10000, "삼성", 100);
		컴퓨터 com2 = new 컴퓨터(20000, "인텔", 200);
		
		System.out.println(com1);
		System.out.println(com2);
		
		System.out.println(com1.answer(1000, "삼성", 100));
		System.out.println(com2.answer(2000, "인텔", 200));
	}

}
