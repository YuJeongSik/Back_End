package 배열기본;

public class 배열기초확인그림 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr.length);
		
		arr[0]=100;
		arr[2]=200;
		arr[4]=500;
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
