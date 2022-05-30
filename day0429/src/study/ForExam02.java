package study;
/* (if랑 삼항연산자 만들기)
 * 		1
 * 	   212
 * 	  32123
 * 	 4321234
 */
public class ForExam02 {

	public static void main(String[] args) {
		// 별찍기
		// 변수선언 (if랑 삼항연산자 만들기)
		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
