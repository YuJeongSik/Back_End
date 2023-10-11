package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class 리스트연습1 {

	public static void main(String[] args) {
		//순서가 있는 데이터를 모으고 싶을 때 
		//배열??? 컬렉션(리스트 형태)
		//ArrayList 
		ArrayList list = new ArrayList();
		//Collection상속 - add(),....
		list.add(100);
		list.add(11.1);
		list.add(true);
		list.add('a');
		list.add("hong");
		list.add(new Button());
		System.out.println(list);//toString()
		//ArrayList안에 toString()이 재정의(오버라이드) 
		//list라고 주소가 가르키고 있는 데이터들을 프린트하도록 
		
		
		System.out.println(list.get(0)); //위치값은 0부터시작
		System.out.println(list.size());
		
		//hong을 꺼내서 gildong을 붙여 프린트 
		System.out.println(list.get(4)+"gildong");
		//for문으로 이용해서 하나씩 꺼내와 모든 데이터를 아래와 같이 프린트 
		// arraylist는 배열이 아니기에 size로 길이를 찾아야한다!
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값>> "+list.get(i));
		}
		
		System.out.println(list.contains("hong")); //()안에 있는 내용을 포함하고 있는지
		System.out.println(list.indexOf("hong")); //()안에 내용이 어디에 있는지(가장 첫번째거)
		System.out.println(list.isEmpty()); // 리스트가 비어있는지
		list.remove(0); //해당 위치의 인덱스를 삭제
		list.remove(11.1); //해당 내용을 삭제
		list.add(0,"추가");
		list.set(0,"또수정");
		System.out.println(list);
	}

}