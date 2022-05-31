package study;

import java.io.*;

public class MethodEx05 {


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static int getInt(String str)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//인스턴스 메소드
		System.out.println(str + ":");
		int temp = Integer.parseInt(br.readLine());		
		return temp;
	}

	public static void main(String[] args) throws IOException {
		
		MethodEx05 me = new MethodEx05();
		//int kor = 30;
		int kor = getInt("국어점수");
		
		System.out.println("당신의 국어 점수는 " + kor + "점 입니다.");

	}

}
