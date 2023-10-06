package 상속;

public class 별스레드 extends Thread{
	//run() > 실행할 프로세스
	//start() > 동시에 시작
	
	//run()은 이미 Thread안에 정의 되어있다
	//또 사용하면 재정의(오버라이드) 된다
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("*");
		}
	}
}
