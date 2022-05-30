package day0527;
import java.awt.*;//(Abstract Window Toolkit)

import javax.swing.JFrame;
import javax.swing.SwingContainer;
import javax.swing.event.*;
public class WindowEvent extends JFrame {

		public WindowEvent() {
			super("이벤트");
			
			JButton j1 = new JButton("확인");
			JButton j2 = new JButton("확인");
			SwingContainer con = (SwingContainer)getContentPane();
			
		
	}
	class WinEventEx extends WindowAdanter{
		
	}
	public static void main(String[] args) {

	}

}
