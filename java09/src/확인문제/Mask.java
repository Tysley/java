package 확인문제;

public class Mask {
	String color;
	int money;
	int sum;
	
	public Mask(String color, int money, int sum) {
		this.color = color;
		this.money = money;
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", money=" + money + ", sum=" + sum + "]";
	}
	
}
