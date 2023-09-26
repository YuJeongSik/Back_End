package 배열응용;

public class 여러개배열사용 {

	public static void main(String[] args) {
		String[] 식구 = {"아버지","어머니","형","나","동생"};
		int[] 나이 = {100, 99, 88, 77, 55};
		double[] 키 = {199.9, 189.9, 179.9, 169.9, 159.9};
		
		for (int i = 0; i < 식구.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
			// \t는 탭만큼 간격을 유지하라는 뜻이다
		}
	}

}
