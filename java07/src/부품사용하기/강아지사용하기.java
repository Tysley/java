package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 d1 = new 강아지();
		d1.name = "바둑이";
		d1.age = 5;
		
		System.out.println(d1.name);
		System.out.println(d1.age);
		d1.밥주기();
		
		강아지 d2 = new 강아지();
		d2.name = "깜둥이";
		d2.age = 2;
		
		System.out.println(d2.name);
		System.out.println(d2.age);
		d2.밥주기();
	}

}
