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

public class 음식주문정보시스템2 {

	static int count; // 0으로 초기화
	static int 짬뽕 ;
	static int 우동 ;
	static int 짜장 ;
	final static int 짬뽕PRICE = 3500;
	final static int 우동PRICE = 3000;
	final static int 짜장PRICE = 4000;

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

		b1.setBackground(Color.red);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.cyan);

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);
		result.setForeground(Color.red);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ImageIcon icon = new ImageIcon("111.png");
				count++;
				짬뽕++;
				countLabel.setText(count + "개");
				int i = (짬뽕 * 짬뽕PRICE) + (우동 * 우동PRICE) + (짜장 * 짜장PRICE);
				f.setTitle("짬뽕 : " + 짬뽕 + "개 우동 : " + 우동 + "개 짜장 : " + 짜장+ "개");
				result.setText("결제금액 " + i + "원");
				imgLabel.setIcon(icon);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("222.png");
				count++;
				우동++;
				countLabel.setText(count + "개");
				int i = (짬뽕 * 짬뽕PRICE) + (우동 * 우동PRICE) + (짜장 * 짜장PRICE);
				f.setTitle("짬뽕 : " + 짬뽕 + "개 우동 : " + 우동 + "개 짜장 : " + 짜장+"개");
				result.setText("결제금액 " + i + "원");
				imgLabel.setIcon(icon);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("333.png");
				count++;
				짜장++;
				countLabel.setText(count + "개");
				int i = (짬뽕 * 짬뽕PRICE) + (우동 * 우동PRICE) + (짜장 * 짜장PRICE);
				f.setTitle("짬뽕 : " + 짬뽕 + "개 우동 : " + 우동 + "개 짜장 : " + 짜장+"개");
				result.setText("결제금액 " + i + "원");
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