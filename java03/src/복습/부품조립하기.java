package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		//1.자주써서 RAM에 언제든 사용할 수 있도록 준비되어있음
		//	부품명.기능()
		
		//2.쓸때마다 제공되는 틀을 이용해 여러개를 찍어서 사용
		// 벽돌 b1 = new 벽돌();
		// 벽돌 b2 = new 벽돌();
		// 벽돌 b3 = new 벽돌();
				
		JFrame f = new JFrame();
		f.setSize(400,300);
		
		
		JLabel l = new JLabel();
		l.setText("숫자를 입력");
		
		JTextField text = new JTextField(10);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("궁서", 1, 30);
		b.setText("숫자 맞추기 게임");
		
		//JFrame 배치를 물 흐르듯이 순서대로 붙여주는 부품
		f.setLayout(flow);
		
		//입력칸 색, 폰트 설정
		text.setBackground(Color.CYAN);
		text.setForeground(Color.blue);
		text.setFont(font2);
		
		f.add(l);
		//jTextField를 add해주세요
		f.add(text);
		f.add(b);
		
		l.setFont(font);
		l.setForeground(Color.red);

		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		
		
		f.setVisible(true);
		
		
		
		
	}

}
