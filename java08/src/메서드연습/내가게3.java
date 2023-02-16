package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();

		int price = 7000;
		int count1 = 5;
		int count2 = 4;

		// 1. 오늘 온 손님의 합은 9명 입니다
		int result = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 합은 " + result);
		// 2. 손님 수 차이는 1명입니다
		int result2 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + result2 + "명입니다");
		// 3.오전 결제 금액은 35000원입니다
		int result3 = price * count1;
		System.out.println("오전 결제 금액은 " + result3);
		// 4.오후 결재금액은 28000원입니다
		int result4 = price * count2;
		System.out.println("오후 결제 금액은 " + result4);
		// 5. 오늘 하루 총 결제 금액은 63000원 입ㄴ디ㅏ
		int result5 = result3 + result4;
		System.out.println("오늘 하루 결제 금액은 " + result5);
		// 6. 1인당 결제금액은 7000원 입니다
		int result6 = result5 / (count1 + count2);
		System.out.println("1인당 결제 금액은 " + result6 + "원 입니다");
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.334));
		System.out.println(Math.floor(3.334));
		System.out.println(Math.round(3.334));
		System.out.println(Math.round(3.534));
		System.out.println(Math.sqrt(100)); //루트
		System.out.println(Math.max(100, 200)); 
		System.out.println(Math.min(100, 200)); 
		System.out.println(Math.pow(2, 3)); //2의 3승
	}

}
