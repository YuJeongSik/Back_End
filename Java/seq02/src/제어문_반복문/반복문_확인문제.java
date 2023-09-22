package 제어문_반복문;

public class 반복문_확인문제 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print("*");
			if(i==9) {
				System.out.println("");
			}
		}
		System.out.println("--------------------");
		for(int i=0; i<5; i++) {
			System.out.print("커피*");
			if(i==4) {
				System.out.println("");
			}
		}
		System.out.println("--------------------");
		for(int i=0; i<3; i++) {
			System.out.println("커피*우유");
		}
		System.out.println("--------------------");
		// for(i=0;i<3;i++)
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + " : 짱!");
		}

	}

}
