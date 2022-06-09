package com.ysh.loginex;

import java.util.*;

public class LoginMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isStop = false;

		LoginSVC loginSVC = new LoginSVC();

		do {

			System.out.println("�α��� ȭ���Դϴ�.");
			System.out.println("���̵�� �н����带 �Է��ϼ���.");
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("password : ");
			String password = sc.next();

			UserVO user = loginSVC.login(id, password);

			if (user == null) {
				System.out.println("���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			} else {
				System.out.println("�α����� ����� �����Դϴ�.");
				System.out.println(user);
				isStop = true;
			}

		} while (!isStop);

	}

}
