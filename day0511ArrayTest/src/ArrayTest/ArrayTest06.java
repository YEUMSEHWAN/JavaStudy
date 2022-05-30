package ArrayTest;

//가위바위보1
import java.util.*;

public class ArrayTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] com = { "가위", "바위", "보" };
		// 가위 바위 보 문자열을 저장한 배열

		System.out.println("컴퓨터와 가위바위보 게임을 시작합니다.");
		while (true) {
			System.out.println("가위 바위 보 : ");
			String a = sc.next();
			if (a.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;// 반복문을 탈출 프로그램을 종료
			}
			// 컴퓨터가 가위 바위 보 값을 랜덤으로 지정.
			int n = (int) (Math.random() * 3);
			// 0 1 2 중에서 결정된 정수를 리턴
			String b = com[n];

			System.out.println("사용자 : " + a + "\n컴퓨터 : " + b);

			// 사용자가 "가위"인 경우

			if (a.equals("가위")) {
				
				if(b.equals("가위")) {
					System.out.println("비겼습니다.");
					
				}else if(b.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다..");
				}else {
					
					System.out.println("사용자가 이겼습니다.");
				}
				
			//사용자가 "보"인 경우
			}else if(a.equals("보")) {
				
				if(b.equals("가위")) {
				System.out.println("컴퓨터가 이겼습니다.");
			
				}else if(b.equals("바위")) {
				System.out.println("사용자가 이겼습니다.");
				}else {
					
					System.out.println("비겼습니다.");
				}
				
			//사용자가 "바위"인 경우
			}else if(a.equals("바위")) {
				
				if(b.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
					
				}else if(b.equals("바위")) {
					System.out.println("비겼습니다.");
				}else {
				
					System.out.println("컴퓨터가 이겼습니다.");
				}
			
			}else {
				System.out.println("다시 입력하세요.");
				
			}
			
		}
	}
}
