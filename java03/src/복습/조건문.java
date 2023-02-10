package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77; //숫자맞추기
		int me = 88; //내가 시도한 값
		
		//결과가 무조건 논리형
		if(target == me) {
			System.out.println("정답입니다");
		}else {
			System.out.println("오답입니다");
		}
		 
		//if문은 자체 break기능이 있음
		
		//switch case는 자체 break가 없어 멈추고 싶은 곳에 break를 써주어야함
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답");
			break;
		case "신나":case "놀자":case "나가자": 
			System.out.println("오답");
			break;
		default: //위의 조건이 전부 부합하지 않을경우 //생략가능
			System.out.println("그만해!");
			break;			
		}
	}

}
