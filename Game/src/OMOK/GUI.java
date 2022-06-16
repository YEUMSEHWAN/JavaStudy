package OMOK;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class GUI extends JFrame {
	private Container c;
	MapSize size = new MapSize();
	
	public GUI(String title) {
		c=getContentPane();
		setBounds(200,20,650,700);
		c.setLayout(null);
		Map map = new DrawBoard(size,map);
		setContentPane(d);
		addMouseListener(new MouseEventHandler(map,size,d,this));
		setVisible(ture);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void shoePopUp(String message) {
		JOptionPane.showMessageDialog(this, message, "", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	public static void main(String[] args) {
		
	}

}
