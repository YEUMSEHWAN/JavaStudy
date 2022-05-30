package Member;

import java.util.*;

public class MemberService {

	static void process(Action action, Scanner sc) {
		// Action action = new WriteAction();

		action.excute(sc);// 인터페이스의 다형성 이용

	}
}
