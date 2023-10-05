package 생성자;

public class TV2 {
	public int ch;
	public int vol;
	public boolean onOff;
	
	//생성자는 무조건 void라서 쓰지 않음
	//클래스이름과 동일해야 객체생성시 자동호출 
	//생성자메서드(생성자), constructor 
	//멤버변수 초기화 할때 사용한다
//	public TV2(int c, boolean o, int v) {
//		ch = c;
//		vol = v;
//		onOff = o;
//	}
//	
	//Source - generate constructor using ~ 을 통해 한번에 가능하다
	public TV2(int ch, int vol, boolean onOff) {
		this.ch = ch;	//this.는 해당 클래스에서 사용한다는 뜻이다
		this.vol = vol;
		this.onOff = onOff;
	}
	
	//똑같은 클래스명을 사용해서 만드는 것을 overriding 이라고 한다
	//일치하는 매개변수에 들어간다
	public TV2(int ch, boolean onOff) {
		this.ch = ch;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "TV2 [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}


	public void change() {
		System.out.println("채널 바꾸기");
	}
}
