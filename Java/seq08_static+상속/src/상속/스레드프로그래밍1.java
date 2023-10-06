package 상속;

public class 스레드프로그래밍1 {

	public static void main(String[] args) {
		//스레드는 여러개의 프로그램을 동시에(번갈아) 실행하게 해주는 기법
		별스레드 t1 = new 별스레드();
		골뱅이스레드 t2 = new 골뱅이스레드();
		
		t1.start();
		t2.start();
	}

}
