package 스택틱;

public class 직원 {
	public String name;
	public int age;
	public static int sumAge;
	public String gender;
	public static int count;
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public 직원(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sumAge+=age;
	}
	
	public static int getAvg() {
		//static에서 인스턴스 변수는 사용할 수 없다
		//힙영역의 변수는 객체생성후에 만들어진다
		//static 메서드 안에서는 static변수만 써야한다
		//static 변수나 메서드는 아무때나 접근 가능하다!
		return sumAge / count;
	}
	
}
