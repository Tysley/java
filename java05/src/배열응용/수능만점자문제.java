package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		Random r = new Random(); //랜덤
		int[] su = new int[10000]; //수능 점수 기록 배열
		for (int i = 0; i < su.length; i++) {
			su[i] = r.nextInt(451);
		}

		int zero = 0; //0점
		int sum = 0; //평균
		int man = 0; //만점자
		int[] ma = new int[10000]; // 만점자 index저장하는 배열

		for (int i = 0; i < su.length; i++) {
			sum = sum + su[i]; //점수 합계
			if (su[i] == 0) { // 0점 
				zero++;
			}
			if (su[i] == 450) { //만점
				ma[man] = i; //index기록
				man++;
			}
		}
		System.out.print("만점자는 현재 " + man + "명이고 ");
		for (int i = 0; i < man; i++) {
			System.out.print(ma[i] + "번 ");
		}
		System.out.println("학생이 만점자입니다.");
		System.out.println("0점은 " + zero + "명 입니다.");

		int result = sum / su.length; //평균계산
		System.out.println("평균 점수는 " + result + "점 입니다.");

		int p = 0; 
		for (int i1 = 0; i1 < su.length; i1++) {
			if ((result + 50) >= su[i1] && (result - 50) <= su[i1]) { //평균 +-50점인 학생
				p++;
			}
		}

		System.out.println("평균에 가까운 학생은 " + p + "명");

	}
}
