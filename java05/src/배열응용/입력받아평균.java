package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용
		// 1. 배열을 만들어 주세요
		int[] jumsu = new int[5];
		
		// 배열에 값을 넣을 때는 index가 필요
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			jumsu[i] = Integer.parseInt(data);
		}
		for (int i : jumsu) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//천체 합계구해서 평균
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}
		System.out.println("전체 평균 : "+(sum/jumsu.length));
		//300이상되는 숫자만 찾아서 합계
		sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300) {
				sum = sum + jumsu[i];
			}
		}
		System.out.println("300이상인 값의 총합 : " +sum);
		//300이상 되는 위치인 index 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300) {
				System.out.println("300이상인 값의 index : " + i);
			}
		}
	}

}
