package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		Random r = new Random();
		//r.nextInt(45) : 0 ~ 44
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45)+1));	
		}
		System.out.println();
		for (int i = 2; i <= 10; i++) {
			System.out.println(r.nextInt(9) + 2);
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.println(r.nextInt(28) + 3); 
		}
	}

}
