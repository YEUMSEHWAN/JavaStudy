package study;

import java.io.*;

public class MethodEx05 {


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static int getInt(String str)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ν��Ͻ� �޼ҵ�
		System.out.println(str + ":");
		int temp = Integer.parseInt(br.readLine());		
		return temp;
	}

	public static void main(String[] args) throws IOException {
		
		MethodEx05 me = new MethodEx05();
		//int kor = 30;
		int kor = getInt("��������");
		
		System.out.println("����� ���� ������ " + kor + "�� �Դϴ�.");

	}

}
