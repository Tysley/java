package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"냥", "자기", "책 읽기"},
				{"노래 부르기", "5", "6"},
				{"7", "8", "9"}
		}; // 전체를 프린트!
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		
	}

}
