package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1)
		System.out.print("ID 입력 >>");
		String id = sc.next();
		System.out.print("PW 입력 >>");
		String pw = sc.next();

		if (id.equals("root") && pw.equals("1234")) {
//			System.out.println("로그인 성공!");
			JOptionPane.showMessageDialog(null, "로그인 성공!");
		} else {
//			System.out.println("로그인 실패!");
			JOptionPane.showMessageDialog(null, "로그인 실패!");
		}

		// 2)
		System.out.print("사과 구매 갯수 입력 >>");
		int apple = sc.nextInt();
		System.out.print("사과 가격 입력 >>");
		int apple2 = sc.nextInt();
		System.out.print("딸기 구매 갯수 입력 >>");
		int berry = sc.nextInt();
		System.out.print("딸기 가격 입력 >>");
		int berry2 = sc.nextInt();

		System.out.println("사과 구매 가격은 " + (apple * apple2));
		System.out.println("딸기 구매 가격은 " + (berry * berry2));
		System.out.println("전체 구매 가격 : " + ((apple * apple2) + (berry * berry2)));

		// 3)
		System.out.print("시작값 입력 >>");
		int start = sc.nextInt();
		System.out.print("종료값 입력 >>");
		int end = sc.nextInt();

		int result = 0;
		for (int i = start; i <= end; i++) {
			result = result + i;
		}
		System.out.println("결과값 : " + result);

		// 4)
		System.out.print("시작값 입력 >>");
		int start2 = sc.nextInt();
		System.out.print("종료값 입력 >>");
		int end2 = sc.nextInt();
		System.out.print("점프값 입력 >>");
		int jump = sc.nextInt();

		int result2 = 0;
		for (int i = start2; i <= end2; i = i + jump) {
			result2 = result2 + i;
			if (result2 >= 100) {
				break;
			}
		}
		System.out.println("결과값 : " + result2);
		sc.close();
	}

}
