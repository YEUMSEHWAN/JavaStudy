package com.ysh.Io;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {

		// File f = new File("c:\\ppp\\Hello.txt");(두가지 방법)
		File f = new File("c:/ppp/Hello.txt");

		System.out.println("파일인지 여부 : " + f.isFile());
		System.out.println("디렉토리인지 여부 : " + f.isDirectory());// 디렉토리 ==> 폴더

		// 상대경로 : 현재 위치를 기준으로 그 곳의 위치를 의미함
		// 절대경로 : 모든경로 c:/ppp/Hello.txt

		// . : 현재 위치
		// .. : 현재위치의 바로 상위에 디렉토리를 의미함
		// / : 루트(\)
		System.out.println("상대 경로 : " + f.getPath());
		System.out.println(" 절대 경로" + f.getAbsolutePath());
		System.out.println("파일의 이름 : " + f.getName());
		System.out.println("파일의 길이 : " + f.length());
		System.out.println("파일의 최종 수정 날짜 : " + f.lastModified());
	}

}
