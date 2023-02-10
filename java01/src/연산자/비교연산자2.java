package 연산자;

public class 비교연산자2 {

	public static void main(String[] args) {
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
//		아이디가 동일한 지 비교 // 비교할때 사용
//		비번이 동일한 지 비교 
		System.out.println(id == id2); //false
		System.out.println(pw == pw2); //true
		
//		&& : and 조건, 두 조건이 동일해야 맞다고 판단
//		로그인 처리!
		System.out.println(id == id2 && pw == pw2);
		
		int mem1 = 111;
		int mem2 = 222;
//		|| : or 조건, 두 조건 중 하나만 true라면 true를 반환
		
	}

}
