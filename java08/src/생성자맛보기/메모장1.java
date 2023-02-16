package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 메모장1 {
	public static void open(String s1, String s2) {
		JFrame f = new JFrame();
		f.setTitle("작성된 내용");
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.yellow);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 30);
		
		JLabel l = new JLabel();
		l.setText(s1);
		l.setFont(font);
		JLabel l2 = new JLabel();
		l2.setText(s2);
		l2.setFont(font);
		
		f.add(l);
		f.add(l2);
		f.setVisible(true);
	}
}
