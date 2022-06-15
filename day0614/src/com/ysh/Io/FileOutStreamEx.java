package com.ysh.Io;

import java.io.*;

public class FileOutStreamEx {

	public static void main(String[] args) {

		FileInputStream fos = null;

		try {
			fos = new FileInputStream("c:/ppp/fileout.txt");
			String message = "Work hard Java Programming";
			fos.write(message.getBytes());
			fos.close();

		} catch (Exception e) {

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

	}

}
