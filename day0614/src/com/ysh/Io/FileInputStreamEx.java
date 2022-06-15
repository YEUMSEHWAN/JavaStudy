package com.ysh.Io;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fis = null;

		// 파일을 읽기 위한 배열 선언
		byte _read[] = new byte[100];
		// 키보드 입력한 값을 읽어서 console 배열에 저장.
		byte _console[] = new byte[100];

		try {
			System.out.print("파일명 : ");
			System.in.read(_console);

			String file = new String(_console).trim();
			// trim() --> 공백을 제거하고 안의 내용(100byte까지만)을 읽음.
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
