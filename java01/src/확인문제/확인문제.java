package 확인문제;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String data2 = JOptionPane.showInputDialog("수업끝나고 무엇을 하실 예정인가요?");
		
		String result = "오늘 " + data1 + "입니다. 수업이 끝나고 내가 할 일은 " + data2;
		System.out.println(result);
	}

}
