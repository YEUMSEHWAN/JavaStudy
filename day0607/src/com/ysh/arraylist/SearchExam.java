package com.ysh.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchExam {

	public static void main(String[] args) {

		List<String> lists = new ArrayList<String>();
		lists.add("�츮����");
		lists.add("���");
		lists.add("�츮����");
		lists.add("���ѹα�");
		lists.add("��������");
		lists.add("�뱸");
		lists.add("������Ʈ");
		lists.add("�ڹ�");
		lists.add("�ڿ�");
		lists.add("����");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;

		// �Է¹��� ���ڿ��� �����ϴ� ���ڿ� �˻�
		try {
			System.out.printf("�˻��� �ܾ� : ");
			str = br.readLine();

			ListIterator<String> it = lists.listIterator();

			while (it.hasNext()) {

				String temp = it.next();

				if (temp.startsWith(str)) {
					System.out.println(temp);
				}

			}

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
