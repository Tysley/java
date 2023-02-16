package 배열심화;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 꼽기프로그램 {

	protected static int money;

	public static void main(String[] args) {
		//프레임을 만들어보세요
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.yellow);
		f.setSize(600, 450);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l = new JLabel();
		l.setText("꼽기 프로그램 하나만 꽝!");
		Font font = new Font("돋움", 10, 50);
		Font font2 = new Font("돋움", 10, 50);
		l.setFont(font);
		l.setForeground(Color.red);
		f.add(l);
		
		JButton[] buttons = new JButton[25];

		
		Random r = new Random();
		int p = r.nextInt(25);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i+"");
			buttons[i].setFont(font2);
			f.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int a = Integer.parseInt(text);
					if(a == p) {
						JOptionPane.showMessageDialog(f, "꽝! 총 벌칙금: " + money);
					}
					else {
						buttons[a].setEnabled(false);
						money = money + 10000;
					}
				}
			});
			
		}
		
		
		
		f.setVisible(true);
	}

}
