package com.ysh.boardex;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();

	}

	// 글쓰기 메소드
	public void writeArticle(Scanner sc) {
		System.out.println("게시판 글 작성하세요.");

		System.out.print("작성자 : ");
		String register = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		System.out.print("비밀번호 : ");
		String passwd = sc.next();

		System.out.print("제목 : ");
		String subject = sc.next();

		System.out.print("글 내용 : ");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		// ArrayList 에 추가
		addArticle(boardVO);

		// boardList.add(boardVO);
		addArticle(boardVO);
	}

	// 글을 리스트에 추가 메소드
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// 목록보기 메소드
	public void listArticle(Scanner sc) {
		if (boardList.size() > 0) {

			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}

		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}

	}

	// 글삭제 메소드
	public void removeArticle(Scanner sc) {

		System.out.println("게시글을 제거할때는 작성자와 비밀번호를 입력하세요.");
		System.out.print("작성자 : ");
		String name = sc.next();
		System.out.println("비밀버호");
		String passwd = sc.next();

		removeArticle(name, passwd);

	}

	private void removeArticle(String register, String passwd) {
		// 삭제 기능 구현

		if (boardList.size() > 0) {

			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {

				if (boardList.get(i).getRegister().equals(register)) {// 작성자가 맞는경우
					if (boardList.get(i).getPasswd().equals(passwd)) {// 비밀번호가 일치한 경우
						boardList.remove(boardList.get(i));
						index = i;

					}
				}

			}
			if (index == -1) {// 인덱스가 없는 경우
				System.out.println("해당 작성자가 업ㄱ거나 비밀번호가 일치하지 않습니다.");
				return;
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}
}
