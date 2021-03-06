package Member;

import java.util.*;

public class MemberMain {

	static MemberVO[] members;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		members = new MemberVO[0];

		boolean isStop = false;

		do {
			System.out.println("다음 메뉴중 하나를 선택하세요.");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 수정");
			System.out.println("5. 종   료 ");

			String command = sc.next();

			switch (command) {
			case "1":
				WriteAction writeAction = new WriteAction();
				MemberService.process(writeAction, sc);
				break;
			case "2":
				ListAction listAction = new ListAction();
				break;
			case "3":

				break;
			case "4":
				UpdateAction updateAction = new UpdateAction();
				MemberService.process(updateAction, sc);
			case "5":
				isStop = true;
			}

		} while (isStop);
	}

}
