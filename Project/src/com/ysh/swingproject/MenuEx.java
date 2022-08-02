package com.ysh.swingproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import javax.swing.border.Border;

public class MenuEx extends JFrame implements ActionListener {

	private static final Event FileDialog = null;
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	JPanel panel8 = new JPanel();
	JPanel pg1 = new JPanel();
	JPanel pg2 = new JPanel();
	JPanel pg3 = new JPanel();
	JPanel pg4 = new JPanel();

	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(10);
	JTextField t4 = new JTextField(20);
	JTextArea area1 = new JTextArea(27, 20);
	JTextArea area2 = new JTextArea(27, 20);

	JScrollPane scroll1 = new JScrollPane(area1);
	JScrollPane scroll2 = new JScrollPane(area2);
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	JMenuBar bar = new JMenuBar();
	String box1[] = { "용돈", "월급", "부수입" };
	String box2[] = { "식비", "월세", "생활비" };
	JComboBox<String> combo = new JComboBox(box1);
	JComboBox<String> combo2 = new JComboBox(box2);
	Container c = getContentPane();
	JMenuItem item = new JMenuItem("실행하기");
	JMenuItem item1 = new JMenuItem("저장하기");
	JMenuItem item2 = new JMenuItem("불러오기");

	public MenuEx() {
		setTitle("가계부");
		createMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 600);
		setVisible(true);
		setBackground(getBackground().black);

	}

	// 메뉴를 만들어 프레임 삽입
	public void createMenu() {

		JMenu screenMenu1 = new JMenu("기능");
		screenMenu1.add(item1);
		screenMenu1.add(item2);

		JMenu screenMenu2 = new JMenu("계산기");
		screenMenu2.add(item);

		JMenu screenMenu3 = new JMenu("도움말");
		screenMenu3.add(new JMenuItem("정보"));

		// 메뉴바에 메뉴 삽입
		bar.add(screenMenu1);
		bar.add(screenMenu2);
		bar.add(screenMenu3);

		setJMenuBar(bar);
//=====================================================
		panel1.add(new JLabel("수입"));
		panel1.add(combo);

		panel1.add(new JLabel("금액"));
		panel1.add(t1);

		panel2.add(new JLabel("메모"));
		panel2.add(t2);

		panel3.add(new JLabel("지출"));
		panel3.add(combo2);

		panel3.add(new JLabel("금액"));
		panel3.add(t3);

		panel4.add(new JLabel("메모"));
		panel4.add(t4);

//-------------------------------------------------------
		panel5.add(scroll1);
		panel5.add(scroll2);

		panel6.add(new JButton("INCOME"));

		panel6.add(new JButton("EXPENCE"));
//----------------------------------------------------------
		pg1.setLayout(new GridLayout(5, 1));
		pg2.setLayout(new BorderLayout());

		pg1.add(panel1);
		pg1.add(panel2);
		pg1.add(panel3);
		pg1.add(panel4);
		pg1.add(panel6);

		JPanel leftpanel = new JPanel();
		JPanel rightpanel = new JPanel();
		leftpanel.setLayout(new BorderLayout());
		rightpanel.setLayout(new BorderLayout());
		leftpanel.add(pg1, BorderLayout.SOUTH);
		rightpanel.add(panel5, BorderLayout.EAST);

		pg1.add(panel6, BorderLayout.SOUTH);
		c.add(leftpanel, BorderLayout.WEST);
		c.add(rightpanel, BorderLayout.EAST);
		item.addActionListener(this);
		item1.addActionListener(this);
		// 액션기능
		// 콤보박스 list 추가 액션
		// 패널 7은 컬러다이어로그로.(왼쪽 패널 위쪽으로 추가하기)

	}

	public static void main(String[] args) {
		new MenuEx();
		new JComboBox();
		new JLabel();
		new FileDialog();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item) {
			Calculator calculator = new Calculator();
			calculator.main(box1);
		}
		if(e.getSource() ==item1) {
			FileDialog filedialog = new FileDialog();
			filedialog.action(FileDialog, item1);
		}

	}

}