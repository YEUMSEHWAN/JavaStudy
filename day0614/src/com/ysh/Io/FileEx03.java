package com.ysh.Io;

import java.io.*;
//����,���丮 ���� �� ����

public class FileEx03 {

	public static void main(String[] args) {
		// ���� ����

		File f1 = new File("c:/newDirectory/new.txt");

		try {
			if (f1.exists()) {
				System.out.println("���� �̸� : " + f1.getName());
			} else {
				if (f1.createNewFile()) {
					System.out.println("���ο� ������ ��������ϴ�.");
				}
			}

		} catch (IOException e) {
		}

		// ���丮 ����

		File f2 = new File("c:/newDirectory");
		if (!f2.exists()) {
			f2.mkdir();
		} else {
			System.out.println("���丮 �̸� : " + f2.getPath());
		}

		// ���� Ȥ�� ���丮 ����
//		File f3 = new File("c:/newDirectory");
//		if (f3.exists()) {
//			f3.delete();
//		} else {
//			System.out.println("���� Ȥ�� ���丮�� �������� �ʽ��ϴ�.");
//		}

		// ���� Ȥ�� ���丮 �̸� ����

		File src = new File("c:/ppp/newFile.txt");
		File dest = new File("c:/newDirectory/dest.txt");
		File dset2 = new File("c:/newDirectory/dest2.txt");

		if (src.exists()) {
			src.renameTo(dest);
			src.renameTo(dset2);
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}
