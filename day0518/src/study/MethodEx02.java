package study;

/*
 * 여러가지 기능
 * 1.최대 수, 2.사이의 합계, 3.수열, 4.종료
 */

import java.io.*;

public class MethodEx02 {
//최대값 구하는 메소드 작성
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("첫번째 정수 입력");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두번째 정수 입력");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		} else {
			return b;
		} // end aaa
	}

	// 두 수 사이의 합계를 구하는 메소드
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("첫번째 정수 입력");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두번째 정수 입력");
		int b = Integer.parseInt(br.readLine());

		// 누적 변수 선언
		int total = 0;
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		for (int i = a; i <= b; i++) {
			total += i;
		}

		System.out.println(a + "~~~" + b + "사이의 합계 : " + total);
		return;

	}// end bbb

	//큰 순서대로 나열하는 수열을 구현하는 메소드
	public static String ccc(int x,int y,int z) {//firstSu = x, secondSu = y, thirdSu = z
		if(y>=x&&y>=z) {
			//swap 공식에 의거해서 
			int temp = x;
			x = y;
			y = temp;
			
		}else if (z>=x&&z>=y) {
			int temp = x;
			x = z;
			z = temp;
			
			
			
		}if (z>=y) {
			int temp = y;
			y = z;
			z = temp;
			
			
		}
	String abc = x+">="+y+">="+z;
	return abc;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;// 메뉴를 입력 받을 변수

		while (true) {
			System.out.print("1 : 최대 수, 2 : 사이의 합계, 3 : 수열, 4 : 종료");// 안내메세지
			x = Integer.parseInt(br.readLine());

			if (x == 1) {// return값을 갖는다.
				int k = aaa();
				System.out.println("두 수 중 최대 값은 " + k + "입니다");
			} else if (x == 2) {// Call by Name
				bbb();
			} else if (x == 3) {//Call by Value
				System.out.println("첫번째 수 입력 : ");
				int firstSu = Integer.parseInt(br.readLine());
				System.out.println("두번째 수 입력 : ");
				int secondSu = Integer.parseInt(br.readLine());
				System.out.println("세번째 수 입력 : ");
				int thirdSu = Integer.parseInt(br.readLine());
				
				String str = ccc(firstSu,secondSu,thirdSu);
				System.out.println("큰 순으로 나열은 " + str);
			
				
				
				
			} else if (x == 4) {
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("수고 하셨습니다!");
	}
}
