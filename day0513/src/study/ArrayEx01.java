package study;

/*
 * 문]
 * 배열을 이용하여 한명의 학생에 대한 성적처리 프로그램을 작성한다.
 * 과목수, 과목명
 * 이름도 입력
 * 
 * 
 * 이름,과목명,총점,평균,학점
 */
import java.io.*;

public class ArrayEx01 {

	public static void main(String[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		if (ar.length == 0) {
//			System.out.println("과목 수가 없습니다");
//			System.exit(0);
//		} // ar.length : 과목수

		// 이름 입력 받음
		// String[]subject = new String[ar.length];
		System.out.printf("이름입력 : ");
		String name = br.readLine();

		String[] subject = { "국어", "영어", "수학" };
		/*
		 * for (int i = 0; i < ar.length; i++) { //subject[i] = ar[i];
		 * System.out.println(subject[i] + "  "); }
		 */
		int jumsu[] = new int[subject.length + 1];// 총점을 저장하기 위한 공간

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "점수 : ");
			jumsu[i] = Integer.parseInt(br.readLine());// 점수 입력 받음
			// 누적합
			jumsu[jumsu.length - 1] += jumsu[i];
			System.out.println("총점 : " + jumsu[jumsu.length - 1]);
		}
		float avg = jumsu[jumsu.length - 1] / (float) (subject.length);
		// 소수점 3자리에서 반올림 반영
		avg = (int) ((avg + 0.005) * 100) / 100.f;

		// int 가 필요한곳을 찾아라??

		char grade = 0;
		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
			grade = 'F';
			break;
			
		default: grade = 'F';
			break;

		}
		System.out.println("--------------------------------------");
		System.out.println("--------"+name + "님의 성 적 표--------");
		System.out.println("--------------------------------------");
	}
}