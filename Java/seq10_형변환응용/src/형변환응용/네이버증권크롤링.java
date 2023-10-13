package 형변환응용;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("코드를 입력하세요");
		//005930, 086520, 022100
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company);
		System.out.println(conn);
		try {
			Document doc = conn.get();
			//System.out.println(doc);
			Elements list = doc.select("span.code"); 
			//span태그에 있는 code클래스를 가져오라는 뜻
			System.out.println(list.size());
			String code = list.get(0).text();
			System.out.println(code);
			
			System.out.println("-------------------------------");
			
			Elements list2 = doc.select("td.first span.blind");
			System.out.println(list2.size());
			//System.out.println(list2.get(0).text());
			System.out.println(list2.get(1).text());
			String yes = list2.get(0).text();
			String start = list2.get(1).text();
			System.out.println("전일가>> " + yes);
			System.out.println("시작가>> " + start);
			
		} catch (IOException e) {
			e.printStackTrace();
		} //연결할 사이트에서 코드를 다 가져온다
	}

}
