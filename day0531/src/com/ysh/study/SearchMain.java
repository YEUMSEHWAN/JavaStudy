package com.ysh.study;

import java.util.*;

public class SearchMain {

//�̸��� �Ķ���ͷ� �Ͽ� �˻��ϴ� ���α׷�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SearchService ssv = new SearchService();// �ҷ����� ���� ��ü ����

		do {
			System.out.println("�˻��� ȸ�� �̸� : ");
			String name = sc.next();

			boolean SearchResult = ssv.searchMember(name);

			if (SearchResult)
				break;
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");

		} while (true);

	}

}
