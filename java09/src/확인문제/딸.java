package 확인문제;

public class 딸 {
	String name;
	String gender;
	static int count;
	static int dadMoney = 10000;
	static int money;
	
	public 딸(String name, String gender) {
		count++;
		dadMoney = dadMoney - 1000;
		money = money + 1000;
		
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
}
