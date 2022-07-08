package com.ysh.multiex;

import java.awt.*;
import java.awt.event.*;//22
import java.io.*;//4
import java.net.*;//1
import javax.swing.*;//7

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiChatClient implements Runnable, ActionListener {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// �α��� �г�
	private JPanel loginPanel;
	// �α��� ��ư
	private JButton loginButton;
	// ��ȭ��
	private JLabel label1;
	// ��ȭ�� �Է� �ؽ�Ʈ �ʵ�
	private JTextField idInput;

//=======================�α��� ��========================

//=======================�α� �ƿ�========================
	// �α׾ƿ� �г�.
	private JPanel logoutPanel;
	// �α׾ƿ� ��ư.
	private JButton logoutButton;
	// ��ȭ��.
	private JLabel label2;

	// �Է� �г� ����.
	private JPanel msgPanel;

	// �Է� �ؽ�Ʈ �ʵ�.
	private JTextField msgInput;

	// ���� ��ư.
	private JButton exitButton;

	// ���� ������ â
	private JFrame jframe;

	// ä�� ���� ���.
	private JTextArea msgOut;

	// ī�� ���̾ƿ�.
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	// ���� �÷���
	boolean status;

	public MultiChatClient(String ip) {
		this.ip = ip;

		// �α��� �г� ����.
		loginPanel = new JPanel();

		// ���̾ƿ� ����
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("�α���");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
