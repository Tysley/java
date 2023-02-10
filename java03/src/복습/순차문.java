package 복습;

//JOpthinPane이 javax폴더아래 swing폴더에 존재
//위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//입력 --> 처리 --> 출력
		//두개의 숫자를 입력 받은뒤 처리 후 출력
		
		String n1 = JOptionPane.showInputDialog("숫자1입력");
		String n2 = JOptionPane.showInputDialog("숫자2입력");
		
		//처리! 
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		System.out.println((double)n11/n22);
	}

}
