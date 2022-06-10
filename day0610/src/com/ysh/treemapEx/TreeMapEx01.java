package com.ysh.treemapEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("만화", "디지몬 어드벤쳐");
		map.put("호러", "컨저링");
		map.put("영화", "범죄도시2");
		map.put("방화", "쉬리");
		map.put("TV", "런닝맨");

		System.out.println(map);

		Map<String, String> subMap = map.subMap("TV", "만화"); // 가나다 순으로 정렬출력.
		System.out.println(subMap); // 정렬될 순서에서 출력.

		/*
		 * TreeMap 클래스는 소트(정렬)된 상태로 자료가 추가된다.
		 * TreeMap 클래스의 SortedMap<K,V> subMap( K formKey, K tokey)메소드
		 * formKey : 키를 포함함, toKey : 키를 포함하지 않음.
		 * 키 범위를 부분적으로 추출하여 리턴함
		 */
		
		
		
	}

}
