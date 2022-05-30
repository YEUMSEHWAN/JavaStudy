package study;

/*2. 콜라 사이다 마운틴 초코송이 에이스 웨하스가 나오는 자판기 프로그램을 구현하시오
*	 단,0을 입력하면 종료.
*/
import java.util.*;

public class WhileExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1;
		String str = "";

		while (true) {
			System.out.println("1: 콜라 2: 사이다 3: 마운틴 듀 4:초코송이 5:에이스 6:웨하스 0:종료");
			n = sc.nextInt();

			switch (n) {

			case 1:
				str = "콜라";
				break;
			case 2:
				str = "사이다";
				break;
			case 3:
				str = "마운틴 듀";
				break;
			case 4:
				str = "초코송이";
				break;
			case 5:
				str = "에이스";
				break;
			case 6:
				str = "웨하스";
				break;
			case 0:
				break;
			default:
				str = "선택하신 상품이 없습니다.";
				break;

			}
			if (n == 0) {
				System.out.println(" 종료합니다. ");
				break;
//			break;
			}else {
				System.out.printf("선택하신 음료는" + str + "입니다.");
				break;
			}
		}

	}
}
