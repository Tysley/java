package 제어문문제;

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
import javax.swing.JTextField;

public class 회원가입 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);

		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		JLabel l = new JLabel(); //글씨
		
		JButton b1 = new JButton();
		b1.setText("회원가입 처리");
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디 입력");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드 입력");
		JLabel text3 = new JLabel(); //글씨
		text3.setText("이름 입력");
		JLabel text4 = new JLabel(); //글씨
		text4.setText("전화번호 입력");
		
		//글자 넣는 곳..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		//import가 안된 경우 Font위에 마우스를 올리면(또는 F2)
		//import Font~~를 클릭!!
		//단축키로는 컨트롤 + 쉬프트 + o
		Font font = new Font("궁서", 1, 30);
		
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b1.setFont(font);
		
		text1.setForeground(Color.blue);
		text2.setForeground(Color.blue);
		text3.setForeground(Color.blue);
		text4.setForeground(Color.blue);
		
		input1.setBackground(Color.yellow); //배경색
		input1.setForeground(Color.red); //버튼의 위색, 글자색
		input2.setBackground(Color.yellow); //배경색
		input2.setForeground(Color.red); //버튼의 위색, 글자색
		input3.setBackground(Color.yellow); //배경색
		input3.setForeground(Color.red); //버튼의 위색, 글자색
		input4.setBackground(Color.yellow); //배경색
		input4.setForeground(Color.red); //버튼의 위색, 글자색
		b1.setBackground(Color.pink);
		b1.setForeground(Color.white);
		//no.png 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식!
		ImageIcon icon = new ImageIcon("010.png");
		l.setIcon(icon);
		
		f.add(l);
		
		f.add(text1);
		f.add(input1);
		
		f.add(text2);
		f.add(input2);
		
		f.add(text3);
		f.add(input3);
		
		f.add(text4);
		f.add(input4);
		
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				String name = input3.getText();
				String tel = input4.getText();

//				if(id.isEmpty()||pw.isEmpty()||name.isEmpty()||tel.isEmpty()) {
//					JOptionPane.showMessageDialog(f, "회원가입 실패!");
//				} else {
//					JOptionPane.showMessageDialog(f, "회원가입 성공!");
//				}
				String message = "아이디 : " + id + "\n비밀번호 : " + pw+ "\n이름 : " + name+ "\n전화번호 : " + tel;
				JOptionPane.showMessageDialog(f, message);
			}
		});
		
		//보여주는 것은 맨 끝으로!!
		f.setVisible(true);
	}

}
