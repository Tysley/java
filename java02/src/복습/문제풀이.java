package 복습;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("암호를 입력하시오");
		
		if(password.equals("pass")) {
			System.out.println("들어오세요");
		}else {
			System.out.println("나가세요");
		}
		
		String menu = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴는? 자장면, 라면, 회에서 선택");
		
		if (menu.equals("자장면")){
			System.out.println("중국집으로 가요");
		} else if(menu.equals("라면")) {
			System.out.println("분식집으로 가요");
		} else if(menu.equals("회")) {
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안 먹어요");
		}
		
		String num1 = JOptionPane.showInputDialog("정수1을 입력하세요");
		String num2 = JOptionPane.showInputDialog("정수2을 입력하세요");		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if(num11 > num22) {
			System.out.println("정수1이 더 큽니다");
		} else {
			System.out.println("정수2가 더 큽니다");
		}
		
		String no = "A100EX";		
		char n = no.charAt(0);
		
		switch (n) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;		
		default:
			System.out.println("해당 부서 없음");
			break;
		}
	}

}
