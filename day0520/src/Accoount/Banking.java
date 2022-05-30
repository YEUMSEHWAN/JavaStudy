package Accoount;

import java.io.*;

public class Banking {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Account na = new Account("홍길동");

		String strWork;

		do {
			System.out.println("\n작업을 선택하세요");
			System.out.println("============================================");
			System.out.println("입		금=========================>1");
			System.out.println("출		금=========================>2");
			System.out.println("잔액   		조회========================>3");
			System.out.println("종		료=========================>0");

			System.out.println("작업 내용을 선택하세요.");
			strWork = br.readLine();

			int switchInt = 0;
			if (strWork != null) {// null일때
				switchInt = Integer.parseInt(strWork);

			} else {// null 아닐때
				System.out.println("작업 내용을 입력하지 않으셨습니다.");
				System.exit(0);
			}

			switch (switchInt) {

			case 0:// 종료됩니다.
				System.out.println("프로그램을 종료 합니다.");
				break;
			case 1:// 입금

				System.out.println("\n======================");
				System.out.print("입금하실 금액을 입력하세요. : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;

			case 2:// 출금
				System.out.println("\n======================");
				System.out.print("출금하실 금액을 입력하세요. : ");
				String strswitchIn = br.readLine();
				long withdrawLong = Long.parseLong(strswitchIn);
				na.withdraw(withdrawLong);
				break;
				
			case 3:// 잔고(잔액확인)
				System.out.println("잔액을 확인 합니다.");
				System.out.println(na.getName() + "님의 잔고는" + na.getBalance() + "입니다.");
			
			default:
				System.out.println(" 0 ~ 3 사이 숫자를 입력하세요 \n");
				break;

			}

		} while (!strWork.equals("0"));

	}

}
