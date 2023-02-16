package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메모장 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("메모장");
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel 제목Label = new JLabel();
		JLabel 내용Label = new JLabel();
		JTextField 제목Text = new JTextField(10);
		JTextArea 내용Area = new JTextArea(10, 10);
		
		
		제목Label.setText("제목 : ");
		내용Label.setText("내용 : ");
		
		
		Font font = new Font("돋움", Font.BOLD, 30);
		제목Label.setFont(font);
		내용Label.setFont(font);
		제목Text.setFont(font);
		내용Area.setFont(font);
		
		f.add(제목Label);
		f.add(제목Text);
		f.add(내용Label);
		f.add(내용Area);
		
		JButton b = new JButton();
		b.setText("전송");
		b.setFont(font);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = 제목Text.getText();
				String detail = 내용Area.getText();
				메모장1.open(title, detail);
				f.setVisible(false);
			}
		});
		
		f.add(b);
		
		f.setVisible(true);
	}

}
