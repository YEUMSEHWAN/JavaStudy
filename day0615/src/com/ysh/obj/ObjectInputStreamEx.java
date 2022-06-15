package com.ysh.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		try {
			// ���Ͽ� ����� ��ü�� �о� ���� ���� ObjectOutputStream ��ü�� ����
			ois = new ObjectInputStream(new FileInputStream("c:/ppp/obj.ccc"));

			// ObjectStream�� ��Ʈ�����κ��� �о�帰 ����ȭ�� ��ü��
			// ������ȭ�ؼ� ��ü�� �����Ҽ� ����
			//

			Data data = (Data) ois.readObject();
			System.out.println("��ȣ : " + data.getNo());
			System.out.println("�̸� : " + data.getName());
			System.out.println("���� : " + data.getMail());

		} catch (ClassNotFoundException cfe) {
			cfe.printStackTrace();
		} catch (FileNotFoundException fife) {
			fife.printStackTrace();
		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
			}

		}

	}

}
