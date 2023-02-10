package 배열;

public class 배열 {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("배열의 길이 : " + a.length);
		a[0] = 100;
		System.out.println("첫번째 위치 : " + a[0]);
		a[4] = 500;
		System.out.println("마지막 위치 : " + a[4]);
		a[2] = 200;
		System.out.println("3번째 위치 : " + a[0]);
		
		System.out.print("배열 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) + "번째 위치 : " + a[i]);
		}
	}
}
