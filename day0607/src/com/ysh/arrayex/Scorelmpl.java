package com.ysh.arrayex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Scorelmpl implements Score {

	private Scanner sc = new Scanner(System.in);
	private List<ScoreVO> list = new ArrayList<ScoreVO>();

	@Override
	public void insert() {// 자료 등록
		System.out.println("\n 자료 등록.");

		String hak;
		System.out.printf("학번입력 : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);

		if (temp != null) {
			System.out.println("이미 등록되어 있는 학번입니다.");
			return;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 입력 : ");
		vo.setName(sc.next());// 이렇게 또는
		// String name = sc.next(); //이렇게
		// vo.setName(name);
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수 : ");
		vo.setMat(sc.nextInt());

		list.add(vo);
		System.out.println("등록 완료!");

	}

	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;

		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}

	@Override
	public void delete() {// 자료 삭제
		System.out.println("\n 자료 삭제...");
		String hak;
		System.out.printf("삭제할 학번 입력 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		list.remove(vo);

		System.out.println("삭제 완료.");

	}

	@Override
	public void update() {// 자료 수정

		System.out.println("\n 자료 수정.");

		String hak;
		System.out.printf("수정할 학번 입력 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		System.out.printf("이름 입력 : ");
		vo.setName(sc.next());
		System.out.printf("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.printf("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.printf("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.printf("수학점수 : ");
		vo.setMat(sc.nextInt());

		System.out.println("수정 완료.");

	}

	@Override
	public void listAll() {// 전제 자료 출력
		System.out.println("\n 목록 전체 출력...");
		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println("====================================================");
			System.out.println(vo);
		}
		System.out.println("====================================================");

	}

	@Override
	public void searchName() {// 이름으로 검색
		System.out.println("\n 이름 검색..");
		String name;
		System.out.printf("검색할 이름 입력 : ");
		name = sc.next();

		for (ScoreVO vo : list) {
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}

	}

	@Override
	public void searchHak() {// 학번으로 검색
		System.out.println("\n 학번 검색..");
		String hak;
		System.out.printf("검색할 학번 입력 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo != null) {
			// System.out.println(vo);//이것 또는 아래것.
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getTot() / 3);

		}

	}
}
