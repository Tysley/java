package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("잘 쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? Y");
			if (data.equals("y")||data.equals("Y")) {
				System.out.println("안녕히가세요!!");
				break;
			} 
		}
	}

}
