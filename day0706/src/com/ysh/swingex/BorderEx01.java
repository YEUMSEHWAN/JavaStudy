package com.ysh.swingex;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class BorderEx01 extends JFrame {
	private JButton[] jb = new JButton[6];
	

	public BorderEx01() {
		super("Border Test");

		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));

		for (int i = 0; i < 6; i++) {
			jb[i] = new JButton(i + "�� ��ư");
			con.add(jb[i]);
		}
		
		
		EmptyBorder eb = new EmptyBorder(10	, 10, 10, 10);
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.red,5);//5 : �� �� �β�
		jb[1].setBorder(lb);
		
		EtchedBorder eeb = new EtchedBorder();//����(����) 
		jb[2].setBorder(eeb);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);//���� Ƣ���
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);//���ִµ��� ���
		jb[4].setBorder(sbb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.green);
		jb[5].setBorder(mb);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new BorderEx01();

	}

}
