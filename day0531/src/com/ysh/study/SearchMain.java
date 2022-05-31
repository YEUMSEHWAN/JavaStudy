package com.ysh.study;

import java.util.*;

public class SearchMain {

//이름을 파라미터로 하여 검색하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SearchService ssv = new SearchService();// 불러오기 위한 객체 생성

		do {
			System.out.println("검색할 회원 이름 : ");
			String name = sc.next();

			boolean SearchResult = ssv.searchMember(name);

			if (SearchResult)
				break;
			System.out.println("해당 회원이 존재하지 않습니다.");

		} while (true);

	}

}
