package 스택틱;

public class 나의일과 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남"); // 호출할때마다 전역변수 초기화
		System.out.println(Day.count); //static은 초기화되지 않는다
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count); //static은 클래스이름으로 접근한다
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		
		//클래스 이름으로 접근해서 쓰는것들은 static이다!
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		System.out.println(Day.sum);
		System.out.println((double)Day.sum/Day.count);
	}

}
