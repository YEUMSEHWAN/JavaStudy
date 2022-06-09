package com.ysh.setex;

import java.util.*;

public class HashTableEx01 {

	private static final String name[] = { "플라톤", "소크라테스", "공자", "맹자", "아리스토텔레스", "신재우" };

	private static final String tel[] = { "111-1111", "222-2222", "333-3333", "555-5555", "666-6666", "777-7777" };

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<>();

		// 해시 테이블에 키,데이터 입력
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);

			// System.out.println(ht);

			// 해시 테이블의 값(번호)을 키(이름)를 이용해서 검색
			String str = ht.get("신재우");

			if (str != null) {
				System.out.println("신재우의 전화번호 : " + str);
			}
		}
			//키가 존재하는지 검색
			if(ht.containsKey("심심해")) 
				System.out.println("심심해 자료가 존재합니다.");
			else
				System.out.println("자료가 존재하지 않습니다.");
			
			//값이 존재하는지 검색
			if(ht.contains("555-5555")) 
				System.out.println("번호 자료가 존재합니다.");
			else
				System.out.println("번호 자료가 존재하지 않습니다.");
			
			
			
			//자료 삭제
			ht.remove("신재우");
			if(ht.containsKey("신재우")) 
				System.out.println("자료가 존재합니다.");
			else
				System.out.println("자료가 존재하지 않습니다.");
			

	}

}
