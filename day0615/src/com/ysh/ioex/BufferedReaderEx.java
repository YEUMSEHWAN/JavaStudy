package com.ysh.ioex;

import java.io.IOException;
import java.io.*;
public class BufferedReaderEx {

	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			
			fis = new FileInputStream("c:/ppp/Hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			//�� ���ξ� �о���� ���ڿ��� ������ ���� ����.
			String str = null;
			
			//readLine() ���๮��(Enter)�� ������ ���๮�� ���������� ���ڿ��� ��ȯ�ϰ�
			//��Ʈ���� ���� �����ϸ� null�� ��ȯ��.
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			try {if (fis != null)fis.close();} catch (IOException e) {}
			try {if (isr != null)isr.close();} catch (IOException e) {}
			try {if (br != null)br.close();} catch (IOException e) {}

		}
	}
}
