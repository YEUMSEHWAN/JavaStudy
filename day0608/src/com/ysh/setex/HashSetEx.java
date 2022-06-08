package com.ysh.setex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// set : 중복을 허용하지 않는다,순서가 없음.
		Set<String> dog = new HashSet<String>();

		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("세퍼드");

		System.out.print("기존 set 데이터 : ");
		System.out.println(dog);
		System.out.println();

		Iterator<String> it = dog.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");

		}

		System.out.println();
		dog.add("진돗개");
		System.out.print("추가 후 set 데이터 : ");
		System.out.println(dog);
		System.out.println();

	}

}
