package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(800, 1000);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel l = new JLabel();
		ImageIcon icon1 = new ImageIcon("스크린.png");
		l.setIcon(icon1);
		f.add(l);

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[200];
		// 반복해서 배열에 버튼 만들어 넣어주세요.
		Font font = new Font("궁서", Font.BOLD, 20);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		int[] seat = new int[btn.length];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			btn[i].setBackground(Color.white);

			// 버튼에 액션기능 add해보자.
			// 1) 액션 기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand(); // "0"
					System.out.println(text);
					int no = Integer.parseInt(text); // "0" --> 0

//					if (seat[no] == 1) { // 예약불가
//						result.setText("예약불가");
//						result.setForeground(Color.blue);
//					}
//					else { // 예약가능
					seat[no] = 1; // 예약좌석은 1로
					result.setText(text + "번 예약완료.");
					btn[no].setBackground(Color.red);
					btn[no].setText("예약");
					btn[no].setEnabled(false);
//					} 
				}
			});
		}

		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);

		f.add(total);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
			}
		});

		JButton reset = new JButton("초기화");
		reset.setFont(font);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < seat.length; i++) {
					seat[i] = 0;
					btn[i].setText(i + "");
					btn[i].setBackground(Color.white);
					btn[i].setEnabled(true);
				}
			}
		});
		f.add(reset);

		f.setVisible(true);
	}
}