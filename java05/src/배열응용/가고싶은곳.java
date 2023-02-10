package 배열응용;

import java.util.Scanner;

public class 가고싶은곳 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[] travle1 = new String[3];
		String[] travle2 = new String[3];

		System.out.print("작년에 가고 싶었던 곳 세 곳을 입력받아 넣으세요");
		System.out.println();
		for (int i = 0; i < travle2.length; i++) {
			System.out.print((i + 1) + "번째 >>");
			travle1[i] = sn.next();
		}
		System.out.println();
		System.out.print("올해에 가고 싶었던 곳 세 곳을 입력받아 넣으세요");
		System.out.println();
		for (int i = 0; i < travle2.length; i++) {
			System.out.print((i + 1) + "번째 >>");
			travle2[i] = sn.next();
		}

		int count = 0;
		for (int i = 0; i < travle2.length; i++) {
			if (travle1[i] == travle2[i]) {
				count++;
			}
		}
		System.out.println("우선순위가 동일한 곳은 총 " + count + "곳이다");
		sn.close();
	}

}
