package com.ysh.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FindPane extends JPanel implements ActionListener {

	// ȭ�� ���� �ɹ� �ʵ� ����
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];

	private JButton okb;
	private JButton rsb;

	// ����
	String[] caption = { "��ȣ : ", "�̸� : ", "��å : ", "�μ� : ", "���� : " };

	public FindPane() {
		setLayout(new GridLayout(7, 1));

		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// �Է� ���� �׸��� ����

		// �ؽ�Ʈ �ʵ�� ������ �гο� ��� addPane�� �߰�

		int i;
		for (i = 0; i < size; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);

			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);

			tf[i].setEditable(false);
			// �ؽ�Ʈ �ʵ带 �Է� �Ұ����� ���·� ��ȯ.
			if (i == 0 || i == 1) {
				tf[i].setEditable(true);
				// ����� �̸����� �˻��ؾ� �ϹǷ� �Է� ������ ���·� ����.
			}

		}
		jp[size] = new JPanel();

		okb = new JButton("���������ȸ");
		okb.addActionListener(this);

		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this);

		jp[size].add(okb);
		jp[size].add(rsb);

		add(jp[size]);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String ae_type = ae.getActionCommand();
		// �̺�Ʈ�� �߻��� ��ư�� ĸ�� ���� ����.

		EmployeeVO evo = null;
		// �˻��� ��������� ������ VO ��ü

		EmployeeDAO edvo = null;
		// �����ͺ��̽� ó���� ���� DAO ��ü

		if (ae_type.equals(okb.getText())) {// ��ȸ ��ư�� �������
			try {
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				if (!sno.equals("") && !sname.equals("")) {// ���, �̸� ���� �˻�����
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);

				} else if (!sno.equals("") && sname.equals("")) {// ��ȣ
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);

				} else if (sno.equals("") && !sname.equals("")) {// �̸�
					evo = edvo.getEmployeeName(sname);
				}

			} catch (Exception e) {
				System.out.println("e : [" + e + "]");

			}
			if (evo != null) {// �ش��ϴ� ����� �������� �ʴ´ٸ� �ʵ� �ʱ�ȭ.

				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail() + "");

			} else {
				JOptionPane.showMessageDialog(this, "�˻� ����..");
			}

		} else if (ae_type.equals(rsb.getText())) {// �ٽþ��� ��ư�� �������
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
		}

	}

}
