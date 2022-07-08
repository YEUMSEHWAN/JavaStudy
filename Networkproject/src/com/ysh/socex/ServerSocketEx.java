package com.ysh.socex;

import java.net.*;

public class ServerSocketEx {

	public static void main(String[] args) throws Exception {
		// 사용자들을 받아들이기 위해 serverSocket이 필요함
		ServerSocket ss = new ServerSocket(3000);

		while (true) {
			// 접속자(클라이어느)가 접속할때까지 무한 대기
			Socket s = ss.accept();

			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip + "님이 접속 하셨습니다.");
		}

	}

}
