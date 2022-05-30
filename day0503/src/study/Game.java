package study;

/*
 *0에서99가지의 임의의 수를 가진 카드를 한장 숨기고
 *이 카드 수를 맞추는 게임임.
 *카드속의 수가 77이라면 수를 맞추는 사람이 55를 입력하면
 *더 높게 다시 70을 입력하면 더 높게 라는 식으로 범위를 좁혀가면서 
 *게임을 맞추는 것임
 *게임을 반족하기 위해 y/n을 묻고, n인 경우는 종료함
 *
 * 컴퓨터가 숨길 수를 임의로 선택하기 위해 Random 클래스를 사용함
 * Random 클래스 사용법은
 * 1.import java.util.*;
 * 2.Random r = new Random();(main()메소드 안에 작성)
 * 				int i = r.nextlnt(100);을 의미는 
 * 				0~99까지의 임의의 정수를 생성함.
 * 
 * String str = sc.next();
 * if(str.equals("n")){
 * system.exit(0);
 * break; 
 */
import java.util.*;

public class Game {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// 변수선언
		// low,high,card
		int low, high, card;

		// n : (y/n) 문자열이 입력되면 게임을 반복진행 여부를 판단.
		while (true) {
			int i = 0;// 사용자의 시행 횟수
			low = 0;// 카드의 최소값
			high = 99;// 카드의 최대값

			// 0과 99의 사이의 정수(난수)값을 생성함(숨김값)
			card = r.nextInt(100);
			System.out.println("숨겨진 값을 맞춰 보세요~");

			while (true) {
				System.out.println("입력할수 있는 값의 범위" + low + "~~" + high + "입니다.");

				int n = 0;
				n = sc.nextInt();// 값을 입력받음.

				// 입력한 값의 범위를 벗어난 경우와 정상적인 경우를 판정
				if (n > high || n < low) {
					System.out.println("입력받은 값은 범위를 초과하셨습니다.");
				} else {
					if (n == card) {
						System.out.println("오~겨우 맞췄네!ㅋㅋㅋㅋ");
						break;
					}else if(n>card) {//입력된 값이 숨겨진 카드값보다 큰 경우
						System.out.printf("메롱~ 더 낮지롱~ : \n");
						high = n;
					}else {//입력된 값이 카드값보다 작은 경우
						System.out.printf("메롱~ 더 크지롱~ : \n");
						low = n;
					}
				}
				i++;//시행 횟수 증가
				} // 안쪽 end while
				System.out.printf("게임 계속 할래?(y/n): ");
				if (sc.next().equals("n"))
					break;

			} // 바깥쪽 end while
		}

	}
