package com.ysh.Io;

//���� ��� ���
import java.io.*;

public class FileEx02 {

	public static void main(String[] args) {

		File directory = new File("c:/");

		if (directory.exists()) {// ���� ���� ���� �˻�
			if (directory.isDirectory()) {// ���丮���� �ƴ���?
				// ���� ���丮 ���� ��� ������ ��� ���
				String[] fileNameList = directory.list();

				// ���� ��� ���
				for (String fileName : fileNameList) {
					System.out.println("���� �̸� : " + fileName);
				}

			}
		}

	}

}
