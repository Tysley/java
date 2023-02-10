package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100)+1;
		Scanner sn = new Scanner(System.in);
		
		int data = 0;
		int i = 0;
		while (true) {
			i++;
			System.out.print("생각한 정답은? >>");
			data = sn.nextInt();
			
			if (data == target) {
				System.out.println("정답입니다");
				System.out.println("전체 시도 횟수 : " + i);
				break;
			} else {
				System.out.println("오답입니다");
				System.out.println("다시 시도해주세요");
				if (data > target) {
				System.out.println(">>너무 커요");
				}else {
					System.out.println(">>너무 작아요");
				}
			} 
		}
		sn.close();
	}

}
