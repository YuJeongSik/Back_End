package 제어문_조건문;

public class SwitchTest1 {

	public static void main(String[] args) {
		String name="자바";
		
		
		//정수(long제외), char, String가능. 실수 불가능!
		switch (name) {
		case "자바":
			System.out.println("1101호로 가라!");
			break;
		case "파이썬":
			System.out.println("1102호로 가라!");
			break;
		case "리눅스":
			System.out.println("1103호로 가라!");
			break;

		default:
			System.out.println("카운터로 가라!");
			break;
		}

	}

}
