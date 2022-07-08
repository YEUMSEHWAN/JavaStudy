package com.ysh.unicastex;

import java.io.*;
import java.net.*;

public class UnicastServer {

	public UnicastServer() {
		ServerSocket server = null;
		try {
			// 서버 소켓 생성.
			server = new ServerSocket(5000);

		} catch (IOException ii) {
			System.out.println("해당 포트가 사용중입니다.");
			System.exit(0);
		}

		try {
			while (true) {
				System.out.println("Server Ready..");
				Socket socket = server.accept();

				/*
				 * 클라이언트와 메시지를 송수신 할 수 있는 스레드 생성. 스레드 생성시 socket을 전달받아서 구현한다. 스레드를 시작함.
				 */

				// 스레드 클래스 호출.
				UnicastServerThread thread = new UnicastServerThread(socket);

				thread.start();

			}
		} catch (IOException ii) {
			ii.printStackTrace();

		}
	}

	public static void main(String[] args) {

	}

}
