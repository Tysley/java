package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {
	public static void main(String[] args) {
		// 기본 순차문 == 입력 --> 처리-->출력
		// 입력 -> 부품사용
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		// 처리 -> 글자 연결
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		// 출력 -> 모니터화면에 보이고 싶음
		System.out.println(result);
		System.out.println(result2);
	}
}
