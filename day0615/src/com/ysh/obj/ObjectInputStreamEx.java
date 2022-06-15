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
			// 파일에 저장된 객체를 읽어 오기 위해 ObjectOutputStream 객체를 생성
			ois = new ObjectInputStream(new FileInputStream("c:/ppp/obj.ccc"));

			// ObjectStream은 스트림으로부터 읽어드린 직렬화된 객체들
			// 역직렬화해서 객체를 생성할수 있음
			//

			Data data = (Data) ois.readObject();
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("메일 : " + data.getMail());

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
