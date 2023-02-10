package 배열응용;

public class 여러개배열사용하기 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 2학기 성적이 오른 학생 몇명?
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println("2학기 성적이 오른 학생은 몇명? " + count + "명");

		// 1, 2학기 성적이 동일한 학생 몇명?
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println("1학기 2학기 성적이 동일한 학생은 몇명? " + count2 + "명");

		// 2학기 학생 중 만점(100점)인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 만점인 학생의 이름은 " + names[i] + " " + (i + 1) + "번");
			}
		}

		// 1학기 성적의 평균과 2학기 성전의 평균 중 누가 더 높앗나요
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < term2.length; i++) {
			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];
		}
		double result1 = sum1 / (double) term1.length;
		double result2 = sum1 / (double) term2.length;
		if (result1 > result2) {
			System.out.println("1학기 평균이 더 높아요");
		} else {
			System.out.println("2학기 평균이 더 높아요");
		}

		// 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 1학기 성적은 " + term1[i]);
				System.out.println("뉴진스의 2학기 성적은 " + term2[i]);
				break;
			}
		}
	}
}
