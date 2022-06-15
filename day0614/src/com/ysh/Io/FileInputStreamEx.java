package com.ysh.Io;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fis = null;

		// ������ �б� ���� �迭 ����
		byte _read[] = new byte[100];
		// Ű���� �Է��� ���� �о console �迭�� ����.
		byte _console[] = new byte[100];

		try {
			System.out.print("���ϸ� : ");
			System.in.read(_console);

			String file = new String(_console).trim();
			// trim() --> ������ �����ϰ� ���� ����(100byte������)�� ����.
			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read));

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

	}

}
