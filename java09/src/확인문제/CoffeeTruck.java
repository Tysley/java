package 확인문제;

public class CoffeeTruck extends Truck{
	int money;
	static int sum;
	@Override
	public String toString() {
		return "CoffeTruck [money=" + money + ", Color=" + Color + ", name=" + name + "]";
	}
	public void 커피한잔() {
		sum++;
		System.out.println("구매 감사합니다!");
	}


}
