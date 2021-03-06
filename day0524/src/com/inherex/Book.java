package com.inherex;

/*
 * 사용자가 읽은 책과 평점을 저장하는 객체 배열을 생성해보자. 다음과 같은 메뉴가 제공된다.
 * ===============================================
 * 1.책 등록
 * 2.책 검사
 * 3.모든 책 출력
 * 4.종료
 * ===============================================
 * 번호를 입력하시오 : 1
 * 제목 : The Java Language
 * 평점 : 9.5
 */
import java.util.*;

class BookExam {
	static int count;
	String title;
	int score;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;

	}

	@Override
	public String toString() {
		return "Book[제목 =" + title + ",평점 =" + score + "]";
	}

	public BookExam(String title, int score) {
		this.score = score;
		this.title = title;
		count++;
	}
}

public class Book {

	public static void main(String[] args) {
		ArrayList<BookExam> list = new ArrayList<BookExam>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("====================================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("====================================");

			System.out.println("메뉴를 선택해주세요.");
			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.print("책 제목 : ");
				String title = sc.next();
				System.out.println();
				System.out.print("책 평점 : ");
				int score = sc.nextInt();
				list.add(new BookExam(title, score));

				break;

			case 2:
				System.out.print("책 제목 : ");
				String title2 = sc.next();

				for (BookExam e : list) {
					if (e.getTitle().equals(title2)) {
						System.out.println(e);
					}
				}
				break;
			case 3:
				for (BookExam e : list) {
					System.out.println(e);
				}
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.\n");
				return;

			}

		}

	}

}
