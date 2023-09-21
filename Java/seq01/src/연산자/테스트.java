package 연산자;

public class 테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a100";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		//charAt()은 String에서 ()번째에 있는 문자열을 고르는 명령어이다		

		char c1 = s.charAt(0);
		if(c1=='a') {
			System.out.println("기획0");
		}
		else {
			System.out.println("기획1");
		}
	}

}
