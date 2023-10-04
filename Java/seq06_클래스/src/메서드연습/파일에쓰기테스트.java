package 메서드연습;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에쓰기테스트 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("text2.txt");
			file.write("hi"+"\n");
			file.write("hello"+"\n");
			file.write("goodbye"+"\n");
			file.close(); //stream을 닫는다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
