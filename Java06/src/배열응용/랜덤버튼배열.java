package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 기본형만 들어가는 것이 아니고, 참조형도 가능
		// 정수, 실수, 문자1, 논리 + String, Jbutton ...
		// 기본형은 변수에 값이 저장
		// 참조형은 무조건 주소가 저장
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		// 버튼 200개가 들어갈 배열을 만들자
		JButton[] buttons = new JButton[200];
		//                      {jbutton0,jbutton1,jbutton2..}
		//버튼 200개를 만들어 배열에 저장
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
		}
		
		//위치를 지정해서 넣어주자.
		f.setLayout(null); //위치를 자동으로 잡아주는 부품 안씀
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			// null ==> 조립해서 넣을 부품의 주소가 램에 ㅇ벗음
			// 첫번재 버튼을 가로 500, 세로 500 위치, 크기 100 x 50
			int x = r.nextInt(800);
			int y = r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			//f에 올려주자.
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}
