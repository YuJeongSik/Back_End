package 생성자;

public class 컴퓨터 {
	public int 가격;
	public String 제조회사;
	public int 모니터크기;
	
	public 컴퓨터(int 가격, String 제조회사, int 모니터크기) {
		super();
		this.가격 = 가격;
		this.제조회사 = 제조회사;
		this.모니터크기 = 모니터크기;
	}
	
	@Override
	public String toString() {
		return "컴퓨터 [가격=" + 가격 + ", 제조회사=" + 제조회사 + ", 모니터크기=" + 모니터크기 + "]";
	}

	public String answer(int 가격, String 제조회사, int 모니터크기){
		String ans = "가격은 "+가격+" 제조회사는 "+제조회사+" 모니터크기는 "+모니터크기;
		return ans;
	}
}
