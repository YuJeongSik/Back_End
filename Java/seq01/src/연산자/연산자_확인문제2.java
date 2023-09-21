package 연산자;

public class 연산자_확인문제2 {

	public static void main(String[] args) {
		
		final double PI=3.14; //final을 사용하면 변수값을 바꿀수 없다!(상수화)
		
		double r=2.2;
		double result=PI*r*r;
		System.out.println("원의 면적 >>"+result);
		System.out.printf("원의 면적 >> %.2f",result);
	}

}
