package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명2 {

	public static void main(String[] args) {
		//1)아이유 2)유재석 3)BTS
		//10명에게 설문조사
		int IU = 0;
		int suck = 0;
		int BTS = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("좋아하는 사람은? 1)IU 2)유재석 3)BTS");
			if (data.equals("1")) {
				IU++;
			}else if(data.equals("2")) {
				suck++;
			}else if(data.equals("3")) {
				BTS++;
			}
		}
		System.out.println("IU를 좋아하는 사람 : " + IU + "명");
		System.out.println("유재석을 좋아하는 사람 : " + suck + "명");
		System.out.println("BTS 좋아하는 사람 : " + BTS + "명");
	}

}
