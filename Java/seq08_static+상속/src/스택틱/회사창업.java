package 스택틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 w1 = new 직원("홍길동",25,"여");
		직원 w2 = new 직원("김길동",24,"남");
		직원 w3 = new 직원("송길동",25,"여");
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(직원.count);
		System.out.println(직원.sumAge / 직원.count);
		System.out.println(직원.getAvg());
	}

}
