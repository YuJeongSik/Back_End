package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com");
		System.out.println(conn);
		try {
			Document doc = conn.get();
			//System.out.println(doc);
			Elements list = doc.select("span"); //select를 사용하면 원하는 부분을 가져올수 있다
			//Elements는 ArrayList를 상속받는다
			//조건에 맞는 태그들의 리스트의 객체
			//태그의 원래 이름은 Elements 이다
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
				//.text()는 해당 글자(여기서는 span)사이에 있는 내용 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		} //연결할 사이트에서 코드를 다 가져온다
	}

}
