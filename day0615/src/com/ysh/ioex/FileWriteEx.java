package com.ysh.ioex;

//���Ͽ� ���� ���
import java.io.*;

public class FileWriteEx {

	public static void main(String[] args) {

		FileWriter fw = null;
		try {
			// ���Ͽ� �� ���� ������ ����� �� �ִ� FileWriter ��ü ����
			fw = new FileWriter("c:/ppp/song.txt");
			// fw �� ���ڿ��� �ٷ� ����� �� �ִ�.
			String str = "";
			fw.write("���̒D - ����");
			// �ѱ��� ������ �а� ���� �ִ� Reader,Writer �迭�� ��Ʈ����
			// ���������� ���۸� �����ϰ� ����.
			// ����� ���۴� ���۰� ���� ä���� ������ ��Ʈ���� ���� ��������.
			// �׷��� ���� ä������ ���� ���¿��� ���۸� ������� ���
			// flush() �޼ҵ带 Ȱ���Ͽ� ���۰� ä������ ���� ���¿����� ���� �Ѵ�.
			fw.flush();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
			}

		}
	}
}
