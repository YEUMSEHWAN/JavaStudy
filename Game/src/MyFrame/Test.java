package MyFrame;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		//MyFrame frame = newFrame();
		
		//방법 1 : 가능은 하지만 잘 사용하지 않는다.
		
		JFrame frame = new JFrame("GUI TEST");
		frame.setTitle("제목 테스트");
		
		String title = frame.getTitle();
		System.out.println(title);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
