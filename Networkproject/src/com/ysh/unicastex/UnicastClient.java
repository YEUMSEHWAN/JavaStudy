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
			// ���� ����
			socket = new Socket("localhost", 5000);

		} catch (UnknownHostException ue) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		} catch (IOException ii) {
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}

		try {

			keyboard = new BufferedReader(new InputStreamReader(System.in));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// ������ �޽����� �ְ� ����.
			while (true) {
				// Ű����� ���� �Է��� ���� �б�/
				System.out.print("���� �޽��� : ");
				String mag = keyboard.readLine();

				// �޽����� ������ ����

				bw.write(mag + "\n");
				bw.flush();

				String getMsg = br.readLine();
				System.out.println("���� �� �޽��� : " + getMsg);

			}
		} catch (IOException e) {
			// Ŭ���̾�Ʈ�� ������ ������ ��� ���ܰ� �߻�.
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("[" + address + "]���� ������ ���������ϴ�.");
		}

	}

	public static void main(String[] args) {
		new UnicastClient();
	}

}
