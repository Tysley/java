package 조건문;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요.");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요.");
		String c = JOptionPane.showInputDialog("연산자를 입력하세요");
		
		double num11 = Double.parseDouble(num1);
		double num22 = Double.parseDouble(num2);
		
		double result = 0;
		
		switch (c) {
		case "+":
			result = num11+num22;
			break;
		case "-":
			result = num11-num22;
			break;
		case "*":
			result = num11*num22;
			break;
		case "/":
			result = num11/num22;
			break;
		default:
			break;
		}
		
		System.out.println(result);

		
		String num3 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요.");
		String num4 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요.");
		
		int num33 = Integer.parseInt(num3);
		int num44 = Integer.parseInt(num4);
		
		double result2 = (double)num33/num44;
		System.out.printf("%.2f", result2);
		
		
	}

}
