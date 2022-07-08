package com.ysh.netex;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {

		// InetAddress 객체는 생성자가 아닌 static 메소드를 이용해서 객체를 생성한다.
		try {

			InetAddress ipinfo1 = InetAddress.getByName("www.daum.net");
			// Ip주소 얻기
			String ip = ipinfo1.getHostAddress();
			System.out.println("IP 주소 : " + ip);

			InetAddress[] ipArray = InetAddress.getAllByName("www.naver.com");
			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}

			// 현재 본인 컴퓨터 ip정보.
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("Host Name : " + myHost.getHostName());
			System.out.println("My IP : " + myHost.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();

		}

	}

}
