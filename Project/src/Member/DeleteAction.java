package Member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void excute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 입력하세요.");
		System.out.println("삭제할 회원 이름 입력 : ");
		String name = sc.next();
		// 삭제할 회원의 이름을 인자 값으로 주면서 해당 이름의 회원을 배열객체에서 제거해주는 메소드 호출

		deleteMember(name);
	}

	private void deleteMember(String name) {
		int deleteindex = -1;// 회원이 없다는걸 가정함(인덱스 번호를 -1로 초기화)

		MemberVO[] members = MemberMain.members;
		// 삭제할 회원정보 객체의 인덱스 번호를 찾아내기 위해 Membermain클래스의 static 영역에 공유되어 있는
		// members 배열 레퍼런스 변수의 레퍼런스 값을 가져옴
		MemberVO[] temp = null;
		// 원본 배열의 객체에서 제거할 회원정보 객체를 제거하고 나머지 회원정보 객체를 저장할 배열
		// 객체 레퍼런스 변수명을 temp로 선언함
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				// 참이면 삭제,현재 배열객체에 저장되어 있는 회원 정보 객체 중 파라미터 값으로 전송되어 온
				// name값과 같은name속성 갑ㄳ을 가지고 있는 객체의 배열상의 인덱스 번호를 찾아냄.
				deleteindex = i;
			}
		}
		if (deleteindex == -1) {// delectindex가 -1 이라는 것은 파라미터 전송 되어 온 name 값과 같은name 값을 가지고 있는
			// 회원 정보 객체를 찾지 못했다는 의미이며 메세지를 출력하고 메소드를 종료함
			System.out.println("회원 정보가 존재하지 않습니다.");
			return;
		}
		if (members.length >= 1) {
			temp = new MemberVO[members.length - 1];
			// temp 배열 객체를 MemberMain 클래스에 공유되어 있는 members 배열의 크기보다 하나 작은 크기보다 하나 적게 생성함

			for (int i = 0; i < members.length; i++) {// 배열의 크기를 줄이는 과정
				if (i == deleteindex) {
					continue;
					// 현재 인덱스가 삭제하려는 회원정보의 인덱스와 같으며 continue를 실행하여 건너뜀, 회원정보의 개체를 복사하지 않는다.

				} else if (i > deleteindex) {
					temp[i - 1] = members[i];
					// 현재 인텍스 번호가 삭제하려는 회원 정보의 인덱스 이후 이면 삭제하려는객체의
					// 인덱스 번호가 하나 빠졌기 대문에 삭제하려는 인덱스보다 큰 인덱스에 존재하는
					// 객체들을 앞으로 하나씩 이동시켜서 복사함
				} else
					temp[i] = members[i];
			}
		}
		MemberMain.members = temp;
		// 배열객체 temp 를 MemberMain클래스에 static으로 공유되어 있는 members 변수에 저장함
	}

}
