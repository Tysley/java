package 확인문제;

public class 확인문제4 {

	public static void main(String[] args) {
		int i = 1;
		double d = 29.7;
		char c = '일';
		boolean b = false;
		String s = "그림 그리기";
		
		String result = "제 취미는 " + s +"입니다. 이번달에는 그림을 "
				+ i +"장 그렸고 자주 쓰는 용지인 A4의 세로 길이는" + d + "입니다. 보통 " 
				+ c +"요일에 취미생활을 합니다. 오늘은 그림을 그릴까요?" + b;
		System.out.println(result);
	}

}
