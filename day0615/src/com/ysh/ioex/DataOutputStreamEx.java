package com.ysh.ioex;

/*
 * DataInputStream �� DataOutputStreamEx
 * 
 * 		DataOutputStream
 * -Ư�� ������ Ÿ�԰� ������ ������ä �����͸� ����ϰ� �о� �� �� �ִ� ��Ʈ��
 * -Ư�� ������ Ÿ�԰� ���˿� �°� �а� �� �� �ִ� �޼ҵ带 ������
 * 	writeBoolean, readBoolean, readInt, writeInt, readUTF, writeUTF
 * 
 */
import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream �� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ����� �� ����.
		// DataOutputStream 1�� ��Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư�� ��ġ�� �����Ҽ� �ִ�.

		DataOutputStream dos = null;// 2��
		FileOutputStream fos = null;// 1��

		try {
			// DataOutputStream �� ����� FileOutputStream
			fos = new FileOutputStream("c:/ppp/data.sav");
			// �⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutpurStream ��ü ����
			dos = new DataOutputStream(fos);

			int i = 10;
			double d = 3.14;
			String s = "���� �ڹٸ� ����մϴ�.";
			// DataOutputStream�� �⺻ �ڷ������� �����ϴ� write �޼ҵ尡 ������
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);// UTF=>String

		} catch (FileNotFoundException fnfe) {

		} catch (IOException ie) {

		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
			}
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
			}
		}
	}

}
