package com.ysh.multiex;

import java.awt.*;
import java.awt.event.*;//22
import java.io.*;//4
import java.net.*;//1
import javax.swing.*;//7
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiChatClient implements Runnable, ActionListener {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// 로그인 패널
	private JPanel loginPanel;
	// 로그인 버튼
	private JButton loginButton;
	// 대화명
	private JLabel label1;
	// 대화명 입력 텍스트 필드
	private JTextField idInput;

//=======================로그인 끝========================

//=======================로그 아웃========================
	// 로그아웃 패널.
	private JPanel logoutPanel;
	// 로그아웃 버튼.
	private JButton logoutButton;
	// 대화명.
	private JLabel label2;

	// 입력 패널 구성.
	private JPanel msgPanel;

	// 입력 텍스트 필드.
	private JTextField msgInput;

	// 종료 버튼.
	private JButton exitButton;

	// 메인 윈도우 창
	private JFrame jframe;

	// 채팅 내용 출력.
	private JTextArea msgOut;

	// 카드 레이아웃.
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	// 상태 플래그
	boolean status;

	public MultiChatClient(String ip) {
		this.ip = ip;

		// 로그인 패널 구성.
		loginPanel = new JPanel();

		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");

		loginButton.addActionListener(this);

		// 대화명 라벨
		label1 = new JLabel("대화명");
//	------------------로그인--------------------
		// 패널에 대한 레이아웃
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
// 	------------------로그아웃-------------------
		// 로그아웃 패널 구성
		logoutPanel = new JPanel();
		// 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");

		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// 입력패널
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);

		msgInput.addActionListener(this);

		exitButton = new JButton("종료");
		exitButton.addActionListener(this);

		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// 로그인 / 로그아웃 패널 선택을 위한 카드 레이아웃
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		// 메인 프레임 구성
		jframe = new JFrame("멀티 채팅 프로그램");
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);

		// 수직 스크롤 바는 항상 나타내고, 수평 스크롤 바는 필요시에만 나타나게 함
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		clayout.show(tab, "login");

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		// 종료 버튼 처리
		if (obj == exitButton) {
			System.exit(0);
		} else if (obj == loginButton) {
			id = idInput.getText();
			label2.setText("대화명" + id);
			clayout.show(tab, "logout");
			// 서버와 연결 메소드 호출
			connectServer();

		} else if (obj == logoutButton) {
			// 로그아웃 메시지 전송
			outMsg.println(id + "/" + "logout");
			// 대화창 클리어
			msgOut.setText("");

			// 로그인 패널로 전환
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException ee) {
				ee.printStackTrace();

			}
			status = false;

		} else if (obj == msgInput) {
			// 메시지 전송
			outMsg.println(id + "/" + msgInput.getText());
			// 입력창 초기화(클리어)
			msgInput.setText("");

		}

	}

	public void connectServer() {

		try {
			socket = new Socket(ip, 4000);
			System.out.println("[Client]Server 연결 성공..!");

			// 입출력 스트림 생성
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			outMsg = new PrintWriter(socket.getOutputStream(),true);

			// 서버에 로그인 메시지 전달
			outMsg.println(id + "/" + "login");
			
			// 메시지 수신을 위한 스레드 생성
			thread = new Thread(this);
			thread.start();

		} catch (Exception e) {
			System.out.println("[MultiChatClien] connectServer().Exception 발생");

		}
		
	}

	@Override
	public void run() {
		// 스레드(수신 메시지를 처리하는 변수)
		String msg;
		String[] rmsg;

		status = true;

		while (status) {
			try {
				msg = inMsg.readLine();
				rmsg = msg.split("/");

				// JTextArea에 수신된 메시지 추가.
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");
				// 커서를 현재 대화 메시지에 표시.
				msgOut.setCaretPosition(msgOut.getDocument().getLength());

			} catch (IOException e) {
				status = false;
			}
		}

		System.out.println("[MultiChatClien]" + thread.getName() + "종료됨");

	}

	public static void main(String[] args) {
		new MultiChatClient("127.0.0.1");

	}
}
