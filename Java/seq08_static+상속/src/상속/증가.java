package 상속;

public class 증가 extends Thread{
	
	public void run(){
		for (int i = 1000; i > 0; i--) {
			System.out.println(i);
		}
	}
}
