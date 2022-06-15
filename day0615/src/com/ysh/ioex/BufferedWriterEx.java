package com.ysh.ioex;

import java.io.*;

//텍스트파일에 문자 기록
public class BufferedWriterEx {

	public static void main(String[] args) {

		// Buffered 스트림 : 스트림의 읽고 쓰는 기능을 위해 스트림 내부에 버퍼를 가지고 있는 스트림.
		FileWriter fw = null;
		BufferedWriter bw = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			fw = new FileWriter("c:/ppp/Hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("오늘은 비가 오네요..");
			bw.write("술이 보고싶네요..");
			bw.flush();// *** flush가 있어야 출력 가능 ***

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
