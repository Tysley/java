package 스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int sum;
	
	public static void getAvg() {
		
		System.out.println(sum/count);
	}
	
	public 직원(String name, int age, String gender) {
		count++;
		sum = sum + age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
