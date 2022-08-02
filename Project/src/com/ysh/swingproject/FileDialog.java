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

			chooser = new JFileChooser();// 파일 다이얼로그 생성
		}

		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt","txt");

			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if (ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			// 사용자가 파일을 선택하고"열기" 버튼을 누를경우
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
		}
		public void main(String[] args) {
		FileDialog filedialog = new FileDialog();	
}
	}

}
