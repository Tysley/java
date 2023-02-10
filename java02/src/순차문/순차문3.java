package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String cm = JOptionPane.showInputDialog("키를 입력하시오");
		String kg = JOptionPane.showInputDialog("몸무게를 입력하시오");

		double cm1 = Double.parseDouble(cm);
		double kg1 = Double.parseDouble(kg);
		
		double result = kg1 / ((cm1 / 100) * (cm1 / 100));
		JOptionPane.showMessageDialog(null, result);
//		System.out.println(result);
	}

}
