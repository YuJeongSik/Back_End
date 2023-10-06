package 상속;

public class 스레드프로그래밍2 {

	public static void main(String[] args) {
		증가 plus = new 증가();
		감소 minus = new 감소();
		
		plus.start();
		minus.start();
	}

}
