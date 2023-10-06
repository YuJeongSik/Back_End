package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 s = new 수퍼맨(); //수퍼맨에 상속했기에 s.을 누르면 여러개의 맴버변수와 맴버메소드가 보인다
		s.age = 1000; //사람
		s.speed = 1; //남자 
		s.power = 100; //수퍼맨
		
		s.걷다();
		s.빨리달리다();
		s.우주를날다();
	}

}
