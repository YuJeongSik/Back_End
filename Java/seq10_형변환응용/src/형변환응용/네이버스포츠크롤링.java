package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버스포츠크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("https://sports.news.naver.com/index");
		System.out.println(conn);
		try {
			Document doc = conn.get();
			//System.out.println(doc);
			Elements list = doc.select("strong.title");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
