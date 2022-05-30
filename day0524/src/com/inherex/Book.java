package com.inherex;

/*
 * ����ڰ� ���� å�� ������ �����ϴ� ��ü �迭�� �����غ���. ������ ���� �޴��� �����ȴ�.
 * ===============================================
 * 1.å ���
 * 2.å �˻�
 * 3.��� å ���
 * 4.����
 * ===============================================
 * ��ȣ�� �Է��Ͻÿ� : 1
 * ���� : The Java Language
 * ���� : 9.5
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
		return "Book[���� =" + title + ",���� =" + score + "]";
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
			System.out.println("1. å ���");
			System.out.println("2. å �˻�");
			System.out.println("3. ��� å ���");
			System.out.println("4. ����");
			System.out.println("====================================");

			System.out.println("�޴��� �������ּ���.");
			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.print("å ���� : ");
				String title = sc.next();
				System.out.println();
				System.out.print("å ���� : ");
				int score = sc.nextInt();
				list.add(new BookExam(title, score));

				break;

			case 2:
				System.out.print("å ���� : ");
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
				System.out.println("���α׷��� �����մϴ�.\n");
				return;

			}

		}

	}

}
