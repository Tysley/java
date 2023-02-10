package 조건문;

public class IF문3 {
	public static void main(String[] args) {
		//조건이 여러개일때
		int myNum = 99;
		
		//80최우수
		if(myNum >= 80) {
			System.out.println("최우수");
		}
		//70우수
		else if(myNum >= 70) {
			System.out.println("우수");
		}
		//60보통
		else if(myNum >= 60) {
			System.out.println("보통");
		}
		//나머지는 미달
		else {
			System.out.println("미달");
		}
		
		int myTour = 10;
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
			break;
		}
		//10이면 VVIP
		//6이면 VIP
		//나머지 Normal
	}
}