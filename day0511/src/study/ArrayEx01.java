package study;

public class ArrayEx01 {

	public static void main(String[] args) {

		// int형 = 4byte
		// int score[] = new int [5];
		int[] score;
		score = new int[5];
		int j = 1;

		score[0] = 10;
		score[1] = 10;
		score[j + 1] = 10;
		score[3] = 10;
		score[4] = 10;

		// System.out.println(score); // = [I@123a439b '타입@주소'값 [I는 1차원 int 배열이라는 의미,
		// '@' 뒤에 나오는 16진수는 배열의 주소.
		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + score[i];
		}

		System.out.println(score.length);		
		System.out.println(sum);
		for(int i=0;i<score.length;i++) {//배열을 출력하는 부분
			System.out.printf("score[%d] : %d\n",i,score[i]);
		}
	}

}
