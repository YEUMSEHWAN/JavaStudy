package com.ysh.obj;
import java.io.*;

  //����ȭ�� ��ü�� ���Ͽ� ����

	


public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		
		ObjectOutputStream oos = null;
		
		try {
			//�޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ���ؼ�
			//����� �� �ִ� ObjectOutputStream ��ü�� ����
			oos = new ObjectOutputStream(new FileOutputStream("c:/ppp/obj.ccc"));
			
			//ObjectOutputStream �� ���ؼ� ����ȭ�� �� ���Ϸ� ��ϵ� Data ��ü ����
			//��ü�� �����ϱ��� �ݵ�� Serializable�� �����ϰ� �־����.
			
			Data data = new Data();
			data.setNo(30);
			data.setName("ȫ�浿");
			data.setMail("hong@naver.com");
			// ObjectOutputStream�� ��ü�� ����ȭ �ؼ� ��Ʈ���� ���ؼ�
			//�����Ҽ� �ִ� writeObject() �޼ҵ带 Ȱ����
			oos.writeObject(data);
			
		}catch (FileNotFoundException fife) {
			fife.printStackTrace();
		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			try {if (oos != null)oos.close();} catch (IOException e) {}

		}
		
		
		
		
	}

}
