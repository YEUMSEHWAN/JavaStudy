package com.ysh.ioex;

import java.io.*;

public class PrintWriterEx {

	public static void main(String[] args) {

		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {

			fos = new FileOutputStream("c:/ppp/printwriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);

			pw.println("������ ����..");
			pw.println("�Ϸ簡 �ɰͰ���..");
			pw.println("������..");
			pw.println("�������..");
			pw.println("�񰡿ͼ�....");
			pw.println(true);

		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (fos != null)
					fos.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
			}

		}

	}

}
