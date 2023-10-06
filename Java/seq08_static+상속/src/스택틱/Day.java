package 스택틱;

public class Day {
	//전역변수는 자동초기화된다
	public String doing;
	public int time;
	public String location; //main에서 호출할때마다 초기화된다
	public static int count; //static을 할경우 초기화되지 않고 한개만 사용하게 된다
	public static int sum;
	//그림 생각해보기!
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum+=time;
	}

	@Override
	public String toString() {
		return "Day [하는일=" + doing + ", 날짜=" + time + ", 위치=" + location + "]";
	}
	
	
}
