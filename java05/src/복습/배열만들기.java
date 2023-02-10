package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들기 - 이미 값을 알고 있는 경우
		String[] hobby = {"run", "book", "swim", "walk"};
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i + ": " + hobby[i]);
		}
		for (String x : hobby) {
			System.out.println(x);
		}
		
		// 2. 배열 만들기 - 값을 모르고 있는 경우, 공간부터
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i + ": " + jobs[i]);
		}
		for (String x : jobs){
			System.out.println(x);
		}
		
		String[] t = {"호주", "미국", "일본", "캐나다", "베트남"};
		for (String x : t) {
			System.out.println(x);
		}
		
		char[] c = {'노', '빨', '파', '보', '분'};
		for (char x : c) {
			System.out.println(x);
		}
		
		Double[] k = {124.5, 178.3, 126.4, 65.0, 123.6};
		for (Double x : k) {
			System.out.println(x);
			
		}
	}

}
