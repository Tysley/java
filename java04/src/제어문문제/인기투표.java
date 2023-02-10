package 제어문문제;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		JFrame f = new JFrame();
		f.setSize(320, 450);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// 버튼선언
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();

		// 라벨설정
		JLabel l1 = new JLabel();
		l1.setText("K-pop 인기 투표");
		JLabel l2 = new JLabel();
		l2.setText("1. 아이유");
		JLabel l3 = new JLabel();
		l3.setText("0표");
		JLabel l4 = new JLabel();
		l4.setText("2. 프로미스 나인");
		JLabel l5 = new JLabel();
		l5.setText("0표");
		JLabel l6 = new JLabel();
		l6.setText("3. 스테이씨");
		JLabel l7 = new JLabel();
		l7.setText("0표");

		// 버튼 아이콘
		ImageIcon icon1 = new ImageIcon("IU.jpg");
		// ImageIcon 객체에서 Image 추출후 크기 조절
		Image img1 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		// 새로운 Image 객체로 ImageIcon 객체 생성
		ImageIcon updateIcon1 = new ImageIcon(img1);
		b1.setIcon(updateIcon1);

		ImageIcon icon2 = new ImageIcon("nine.jpg");
		Image img2 = icon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon updateIcon2 = new ImageIcon(img2);
		b2.setIcon(updateIcon2);

		ImageIcon icon3 = new ImageIcon("asap.jpg");
		Image img3 = icon3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon updateIcon3 = new ImageIcon(img3);
		b3.setIcon(updateIcon3);

		Font font = new Font("돋움", 1, 30);
		l1.setFont(font);

		Font font2 = new Font("돋움", 1, 15);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);

		
		l3.setForeground(Color.red);
		l5.setForeground(Color.red);
		l7.setForeground(Color.red);
		
		b1.setPreferredSize(new Dimension(100, 100));
		b2.setPreferredSize(new Dimension(100, 100));
		b3.setPreferredSize(new Dimension(100, 100));
				
		b1.addActionListener(new ActionListener() {	
			int IU = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				IU++;
				l3.setText(IU + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int nine = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				nine++;
				l5.setText(nine + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int stayC = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				stayC++;
				l7.setText(stayC + "표");
			}
		});
		f.add(l1); // 제목

		f.add(b1); // IU
		f.add(l2);
		f.add(l3);

		f.add(b2); // 프로미스나인
		f.add(l4);
		f.add(l5);

		f.add(b3); // 스테이시
		f.add(l6);
		f.add(l7);

		f.setVisible(true);

//		//변수저장
//		int IU = 0; 
//		int BTS = 0;
//		int NewJeans = 0;
//		int result = 0;

//		while(true) {
//			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >>>");
//			result = sn.nextInt(); //콘솔로부터 값을 입력받음
//			if(result == 1) {
//				IU++; //1번 아이유를 선택했을 경우 카운트
//			}else if(result ==2) {
//				BTS++; //2번 BTS를 선택했을 경우 카운트
//			}else if(result == 3) {
//				NewJeans++; //3번 뉴진스를 선택했을 경우 카운트
//			}else if(result == 4){ //4번을 입력했을 경우 exit 
//				System.out.println("시스템을 종료합니다");
//				break;
//			}
//		}
//		System.out.println("아이유 " + IU +"표");
//		System.out.println("방탄 " + BTS +"표");
//		System.out.println("뉴진스 " + NewJeans +"표");

		sn.close();
	}

}
