package ArrayTest;

/*
 * 문]
 * 컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듬.
 * 사용자가 먼저 3가지중 하나를 입력하고 실행함.
 * 컴퓨터는 랜덤으로 하나를 선택하여 사용자와 비교.
 * 누가 이겼는지를 판단하고 사용자가 그만을 입력하면 게임을 종료.
 * 
 * (반복)
 * 가위 바위 보 입력 : 바위
 * 사용자 : 바위 , 컴퓨터 :가위, 사용자가 이겼습니다.
 * 
 * 가위 바위 보 입력: 그만
 * 게임을 종료 합니다.
 * 
 * 문자열 배열 선언
 * String[] str = {"가위","바위","보"};
 * 
 * 컴퓨터가 내는것을 랜덤으로 선택하기 위해서는 
 * int r=(int)(Math.random()*3);
 * 
 * 컴퓨터가 내는것이 바위인지 비교
 * if(str[n].equals("바위"));
 */
import java.util.*;

public class ArrayTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		String a;// 사용자 입력
		String[] str = { "가위", "바위", "보" };

		System.out.printf("가위 바위 보 입력 : ");
		a = sc.next();

		int r = (int) (Math.random() * 3);
		System.out.printf("컴퓨터 : %s", str[r]);

		System.out.println();
		if (a.equals("가위")) {
			if (str[r].equals("가위")) {
				System.out.println("비겼습니다.");
			} else if (str[r].equals("바위")) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
			
		}
		if (a.equals("바위")) {
			if (str[r].equals("바위")) {
				System.out.println("비겼습니다.");
			} else if (str[r].equals("가위")) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
			

		}
		if (a.equals("보")) {
			if (str[r].equals("보")) {
				System.out.println("비겼습니다.");
			} else if (str[r].equals("가위")) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
			
			String stop ="그만";
			System.out.println("새 게임을 하시겠습니까?");
			stop = sc.next();
		}
	}
	}
}
