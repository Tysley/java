package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		
		int[] week = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("week[0] = " + week[0]); //첫번째
		System.out.println("week[1] = " + week[1]); //두번째
		week[2] = 10;//3번째
		week[4] = 12;//5번째
		System.out.println("week[2] = " + week[2]);//3번째
		System.out.println("week[4] = " + week[4]);//5번째
		
		System.out.println("-----------");
		int[] tour = new int[4];
		tour[0] = 20;//1번째
		tour[2] = 30;//3번째
		
		System.out.println("tour[0] = " + tour[0]);//1번째
		System.out.println("tour[2] = " + tour[2]);//3번째
		//길이 출력
		System.out.println("tour.length = " + tour.length);
		
		//우리가족의 성별
		char[] gender = {'M', 'F', 'F', 'F'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		//이름
		String[] name = {"아빠", "엄마", "나", "동생"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//시력
		double[] vision = {0.5, 1.0, 0.3, -0.1};
		for (int i = 0; i < vision.length; i++) {
			System.out.println(vision[i]);
		}
		//점심식사 여부
		boolean[] bab = {false, true, true, false};
		for (int i = 0; i < bab.length; i++) {
			System.out.println(bab[i]);
		}
	}

}
