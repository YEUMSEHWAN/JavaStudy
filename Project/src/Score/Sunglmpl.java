package Score;

import java.util.*;
import java.util.jar.Attributes.Name;

public class Sunglmpl implements Sung {
	Scanner sc = new Scanner(System.in);

	int people;
	Record re[];

	@Override
	public void set() {// 인원수 입력받는 기능
		do {
			System.out.println("인원수 입력");
			people = sc.nextInt();
		} while (people < 1 || people > 10);
		re = new Record[people];
	}

	@Override
	public void input() {// 이름, 학번, 과목별 점수,판정
		String name[];
		String score[] = { "국어", "영어", "수학" };// 과목
		int[] sco = new int[3];// 과목점수
		int number[], avg, sum;

		for (int i = 0; i < re.length; i++) {
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름을 입력(공백 구분) : ", (i + 1));
			re[i].number = sc.nextInt();
			re[i].name = sc.next();

			System.out.print("\t국어 영어 수학 점수 입력(공백 구분) : ");
			re[i].sco[0] = sc.nextInt();// 국어
			re[i].sco[1] = sc.nextInt();// 영어
			re[i].sco[2] = sc.nextInt();// 수학

			// 각 과목별 판정 : 수 : 90점이상,우 : 80점이상,미 : 70점이상,양 : 60점이상,가 : 60점이하(0~59점)
			for (int j = 0; j < re[i].sco.length; j++) {
				if (re[i].sco[j] >= 90)
					re[i].score[j] = "수";
				else if (re[i].sco[j] >= 80)
					re[i].score[j] = "우";
				else if (re[i].sco[j] >= 70)
					re[i].score[j] = "미";
				else if (re[i].sco[j] >= 60)
					re[i].score[j] = "양";
				else
					re[i].score[j] = "가";
			} // end for

			// 총점
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			// 평균
			re[i].avg = re[i].sum / 3;

		}

	}

	@Override
	public void print() {// 결과값 출력하는 기능

		for (int i = 0; i < re.length; i++) {
			System.out.printf(
					"학번:%d 이름:%3s\n 국어: %d점 영어 : %d점 수학 : %d점\n 총점 : %d점 평균 : %d점\n 국어 : %s 영어 : %s 수학 : %s\n",
					re[i].number, re[i].name, re[i].sco[0], re[i].sco[1], re[i].sco[2], re[i].sum, re[i].avg,
					re[i].score[0], re[i].score[1], re[i].score[2]);
		}

	}

}
