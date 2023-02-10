package 복습;

import java.util.Date;

public class 문제풀이2 {
	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		if(year >= 2000) {
			System.out.println("밀레니엄 세대시군요");
		}else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		int day = date.getDay();
		switch (day) {
		case 6: case 0:
			System.out.println("토일은 쉬자!");
			break;
		default:
			System.out.println("나머지 요일은 열심히 공부하자");
			break;
		}
		
		int month = date.getMonth() + 1;
		switch (month) {
		case 2:
			System.out.println("2월은 28일까지");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("4, 6, 9, 11월은 30일까지");
		default:
			System.out.println("나머지는 31일까지");
			break;
		}
	}

}
