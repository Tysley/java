package 배열응용;
import java.util.Scanner;
public class Scanner입력배열로 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] arr = new int[5]; // 정수를 저장할 배열
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 >>");
			arr[i] = sn.nextInt(); //정수 저장
		}
		System.out.println("1번째랑 세번째 값의 합:" + (arr[0] + arr[2]));

		String[] a = new String[3]; //문자열을 저장할 배열
		for (int i = 0; i < a.length; i++) {
			System.out.print("문자 입력 >>");
			a[i] = sn.next(); //문자 저장
		}
		System.out.println(a[0] + "보다는 " + a[2]);

		sn.close(); //스캐너 반드시 닫아주기!
	}

}
