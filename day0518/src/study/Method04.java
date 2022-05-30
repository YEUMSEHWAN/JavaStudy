package study;

import java.io.*;

public class Method04 {

	public static String getString(String str) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + ":");
		String temp =br.readLine();
		return temp;
	}

	public static void main(String[] args)throws IOException {
		String name = getString("¿Ã∏ß");
		System.out.println(name + "¥‘ æ»≥Á«œººø‰");
		
		
	}

}
