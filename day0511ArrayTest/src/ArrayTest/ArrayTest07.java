package ArrayTest;

import java.util.*;

public class ArrayTest07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = { "가위", "바위", "보" };

		Random rd = new Random();

		// 난수 발생
		int com = rd.nextInt(3) + 1;

		int user;

		do {
			System.out.println("1:가위, 2:바위, 3:보 중 입력");
			user = sc.nextInt();
		} while (user < 1 || user > 3);

		 System.out.println("사용자 : "+str[user-1]);
		 System.out.println("컴퓨터 : "+str[com-1]);
		// 처리 결과 출력
		String result;
		result = "무승부";
		// 사용자가 승리한 경우
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			result = "사용자가 승리했습니다.";

		// 컴퓨터가 승리한 경우
		if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) 
			result = "컴퓨터가 승리했습니다.";
			
			System.out.printf("승부 결과 : " + result);
	}	
	}

