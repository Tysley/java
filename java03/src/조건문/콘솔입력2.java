package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
//		1))
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 >>");
		String data1 = sc.next();
		System.out.print("나이 입력 >>");
		String data2 = sc.next();
		System.out.print("취미 입력 >>");
		String data3 = sc.next();
		System.out.println("===============");
		System.out.println("나의 이름은 " + data1);
		System.out.println("나의 나이는 " + data2);
		System.out.println("나의 취미는 " + data3);
		
		System.out.println("===============");
		System.out.print("나의 이름은?");
		String data4 = sc.next();
		System.out.print("나의 키는?");
		double data5 = sc.nextDouble();
		System.out.print("나의 몸무게는?");
		double data6 = sc.nextDouble();
		System.out.print("저녁을 먹었나요?");
		Boolean data7 = sc.nextBoolean();
		System.out.print("나의 좌우명은?");
		sc.nextLine();
		String data8 = sc.nextLine();

		System.out.println("===============");
		System.out.println("내 이름은 " + data4 + "입니다.");
		System.out.println("내 내년 키는 " + data5 + "입니다.");
		System.out.println("내 내년 몸무게는 " + data6 + "입니다.");
		System.out.println("나는 저녁을 " + data7 + "입니다.");
		System.out.println("나의 좌우명은 " + data8 + "입니다.");
		
		sc.close();
	}

}
