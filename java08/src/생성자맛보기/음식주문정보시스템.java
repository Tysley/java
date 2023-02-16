package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템 {

	static int count; // 0으로 초기화
	final static int PRICE = 5000;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("짜장");
		Font font = new Font("궁서", Font.ITALIC, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("111.png");
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
				imgLabel.setIcon(icon);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("222.png");
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
				imgLabel.setIcon(icon);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("333.png");
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
				imgLabel.setIcon(icon);
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);
	}
}