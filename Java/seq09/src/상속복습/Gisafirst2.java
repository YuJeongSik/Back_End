package 상속복습;

public class Gisafirst2 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.paint();
		b.draw();
	}
}
class A2 {	//같은 패키지 안에서 똑같은 클래스명을 사용할 수 없다!
	public void paint() {
		System.out.print("A");
	}
	public void draw() {
		System.out.print("B");
	}
}
class B2 extends A2 {
	public void paint() {
		super.draw();
		System.out.print("C");
		this.draw();
	}
	public void draw() {
		System.out.print("D");
	}
}