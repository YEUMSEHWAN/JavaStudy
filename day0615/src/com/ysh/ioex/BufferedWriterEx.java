package com.ysh.ioex;

import java.io.*;

//�ؽ�Ʈ���Ͽ� ���� ���
public class BufferedWriterEx {

	public static void main(String[] args) {

		// Buffered ��Ʈ�� : ��Ʈ���� �а� ���� ����� ���� ��Ʈ�� ���ο� ���۸� ������ �ִ� ��Ʈ��.
		FileWriter fw = null;
		BufferedWriter bw = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			fw = new FileWriter("c:/ppp/Hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("������ �� ���׿�..");
			bw.write("���� ����ͳ׿�..");
			bw.flush();// *** flush�� �־�� ��� ���� ***

		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
			}
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
			}
		}

	}

}
