package 상속;

public class 감소 extends Thread{
	
	public void run(){
		for (int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
