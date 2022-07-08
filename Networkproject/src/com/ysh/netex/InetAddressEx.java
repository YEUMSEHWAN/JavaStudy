package com.ysh.netex;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {

		// InetAddress ��ü�� �����ڰ� �ƴ� static �޼ҵ带 �̿��ؼ� ��ü�� �����Ѵ�.
		try {

			InetAddress ipinfo1 = InetAddress.getByName("www.daum.net");
			// Ip�ּ� ���
			String ip = ipinfo1.getHostAddress();
			System.out.println("IP �ּ� : " + ip);

			InetAddress[] ipArray = InetAddress.getAllByName("www.naver.com");
			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}

			// ���� ���� ��ǻ�� ip����.
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("Host Name : " + myHost.getHostName());
			System.out.println("My IP : " + myHost.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();

		}

	}

}
