package MyFrame;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		//MyFrame frame = newFrame();
		
		//��� 1 : ������ ������ �� ������� �ʴ´�.
		
		JFrame frame = new JFrame("GUI TEST");
		frame.setTitle("���� �׽�Ʈ");
		
		String title = frame.getTitle();
		System.out.println(title);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
