package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		//프레임을 만들어보세요
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.yellow);
		//프레임을 설정해보세요
		f.setSize(1000, 1000);
		
		//레이아웃 부품 설정하지 않음
		f.setLayout(null);
		
		//버튼을 넣을 배열을 만들어주세요 500개
		JButton[] buttons = new JButton[500];
		//참조형은 배열에 null로 초기화
		
		//버튼을 배열에 넣어주세요
		
		//버튼 배열에 있는  버튼을 꺼내서 위치를 지정 후, f에 붙여주세요
		
		Color[] c = {Color.red, Color.blue, Color.white, 
				Color.gray, Color.green, Color.orange};
		
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
			buttons[i].setBackground(c[r.nextInt(c.length)]);
			int x = r.nextInt(1000);
			int y = r.nextInt(1000);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		
		//심화-2) f에 배경색을 넣어보세요
		
		
		f.setVisible(true);
	}

}
