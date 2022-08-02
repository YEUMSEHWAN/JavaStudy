package com.ysh.swingproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileDialog extends JFrame {

	private JLabel imageLabel = new JLabel();

	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;

		public OpenActionListener() {

			chooser = new JFileChooser();// ���� ���̾�α� ����
		}

		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt","txt");

			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if (ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
				return;
			}
			// ����ڰ� ������ �����ϰ�"����" ��ư�� �������
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
		}
		public void main(String[] args) {
		FileDialog filedialog = new FileDialog();	
}
	}

}
