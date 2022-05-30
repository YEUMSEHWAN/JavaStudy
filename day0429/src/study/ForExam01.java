package study;

public class ForExam01 {

	public static void main(String[] args) {
		// 구구단
		// 변수 선언
		int i, j; // i : 단, i: 내부에서 1~9 반복처리
		for (j = 1; j <= 9; j++) { // 열
			for (i = 2; i <= 9; i++) {// 행
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
			System.out.println();

		}
	}
}
