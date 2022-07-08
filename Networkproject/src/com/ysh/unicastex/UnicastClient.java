package com.ysh.unicastex;

import java.io.*;
import java.net.*;
import java.nio.Buffer;

public class UnicastClient {
	Socket socket = null;

	BufferedReader br = null;
	BufferedWriter bw = null;

	BufferedReader keyboard = null;

	public UnicastClient() {

		try {
			// 소켓 생성
			socket = new Socket("localhost", 5000);

		} catch (UnknownHostException ue) {
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		} catch (IOException ii) {
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
		}

		try {

			keyboard = new BufferedReader(new InputStreamReader(System.in));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 서버와 메시지를 주고 받음.
			while (true) {
				// 키보드로 부터 입력한 내용 읽기/
				System.out.print("전송 메시지 : ");
				String mag = keyboard.readLine();

				// 메시지를 서버로 전송

				bw.write(mag + "\n");
				bw.flush();

				String getMsg = br.readLine();
				System.out.println("수신 된 메시지 : " + getMsg);

			}
		} catch (IOException e) {
			// 클라이언트와 연결이 끊어진 경우 예외가 발생.
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("[" + address + "]와의 연결이 끊어졌습니다.");
		}

	}

	public static void main(String[] args) {
		new UnicastClient();
	}

}
