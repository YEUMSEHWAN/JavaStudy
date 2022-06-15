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

			pw.println("오늘은 슬픈..");
			pw.println("하루가 될것같다..");
			pw.println("이유는..");
			pw.println("배고프고..");
			pw.println("비가와서....");
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
