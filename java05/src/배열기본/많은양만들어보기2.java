package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		//
		int[] jumsu2 = new int[1000];

		Random r = new Random();

		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(20) + 1;
		}
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.println("jumsu2[" + i + "] : " + jumsu2[i]);
		}

		int count = 0;
		int sum = 0;
		// 3 이상인 숫자 몇 개인지 프린트!
		// 배열은 전체를 가지고 와서, 3 이상일 경우 체크
		// 갯수를 세주세요
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) {
				count++;
				sum = sum + jumsu2[i];
			}
		}
		System.out.println("15이상 갯수 : " + count);
		System.out.println("15이상 총합 : " + sum);

	}

}
