package com.ysh.swingex;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx extends JFrame {

	JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

	JLabel rgb = new JLabel("RGB(0,0,0)", JLabel.CENTER);

	JPanel p1 = new JPanel(new GridLayout());
	JPanel west = new JPanel(new GridLayout(0, 1));
	JPanel cen = new JPanel(new GridLayout(0, 1));
	JPanel p2 = new JPanel();

	JLabel rlabel = new JLabel("Red");
	JLabel glabel = new JLabel("green");
	JLabel blabel = new JLabel("blue");

	int r, g, b;

	public JSliderEx() {

		super("JSlider Test");

		red.setMajorTickSpacing(50);
		red.setMajorTickSpacing(5);
		red.setPaintTicks(true);
		red.setPaintLabels(true);

		green.setMajorTickSpacing(50);
		green.setMajorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true);

		blue.setMajorTickSpacing(50);
		blue.setMajorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);

		rlabel.setForeground(Color.red);
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);

		rgb.setFont(new Font("±√º≠√º", Font.BOLD, 25));

		west.add(rlabel);
		west.add(glabel);
		west.add(blabel);
		cen.add(red);
		cen.add(green);
		cen.add(blue);

		p1.add("west", west);
		p1.add("center", cen);
		add("North", rgb);
		add("South", p1);
		add("Center", p2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 400, 300);// √¢¿« ≥–¿Ã
		setVisible(true);

		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());

	}

	class Sevent implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {

			JSlider source = (JSlider) e.getSource();
			if (e.getSource() == red) {
				r = source.getValue();
			}
			if (e.getSource() == green) {
				g = source.getValue();
			}
			if (e.getSource() == blue) {
				b = source.getValue();
			}
			p2.setBackground(new Color(r, g, b));
			rgb.setText("RGB(" + r + "," + g + "," + b + ")");

		}

	}

	public static void main(String[] args) {
		new JSliderEx();
	}

}
