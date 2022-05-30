package study;
/*
 * [char] 자료형 배열에 알파벳 대문자를 채우고,
 * 채워진 배열에 전체 요소를 출력
 * 
 *  단, char 자료형의 배열에 초기화는 반복문을 이용함.
 */

public class ArrayEx03 {

	public static void main(String[] args) {
		// 알파벳 대문자를 구성
		// 1.직접 입력
		/*
		 * char aa[] = new char[26]; aa[0] = 'A'; aa[1] = 'B'; . . aa[25] = 'Z';
		 */
		// 2. 중괄호
		// char aa[] = {'A','B','C',...,'Z'};

		// 3.for 문 활용 b=int 형을 캐릭터형(문자형)으로 바꿈==>아스키코드
		char aa[] = new char[26];
		for (int i = 0, b = 65; i < aa.length; i++, b++) {
			aa[i] = (char) b;
			System.out.printf("%c", aa[i]);

		}
		System.out.println();
		for (int i = 0, b = 97; i < aa.length; i++, b++) {
			aa[i] = (char) b;
			System.out.printf("%c", aa[i]);
		}
		System.out.println();

		char[] alpha = new char[26];
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char) ('A' + i);
			System.out.print(alpha[i]);
		}
	}

}
