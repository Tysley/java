package 확인문제;

public class 내차들 {
	public static void main(String[] args) {
		CoffeeTruck myCar1 = new CoffeeTruck();
		myCar1.name = "붕붕이";
		myCar1.Color = "Blue";
		myCar1.money = 3000;
		System.out.println(myCar1);
		myCar1.내차();
		myCar1.트럭();
		myCar1.커피한잔();
		myCar1.커피한잔();
		
		CoffeeTruck myCar2 = new CoffeeTruck();
		myCar1.name = "붕붕이2";
		myCar1.Color = "red";
		myCar1.money = 2000;
		myCar2.커피한잔();
		
		System.out.println("판매한 커피 수 : " + CoffeeTruck.sum);
	}
}
