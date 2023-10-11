package 상속응용;

public class 배열스레드 extends Thread {

	public void run(){
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지>> "+list[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
