package study;

/*
 * ��]
 * ����,����,���� ������ �Է¹޾� ������ ��� �׸��� ������ ���ϴ� ���α׷��� �ۼ�.
 * ���� : 100~90:A, ~ 60�� ���ϴ� F�� ó��
 * ����� �Ҽ�������2�ڸ����� ǥ��.
 * ��, �� ������ ������ 0~100�� ����� ����.
 * 
 */
import java.util.*;

public class DoWhileExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor=0, eng=0, mat=0, sum = 0;
		char hak = 0;
		float avg = 0.0f;

		do {
		System.out.printf("�������� : ");
		kor = sc.nextInt();
		}while(kor < 0 || kor > 100);
			
		do {
		System.out.printf("�������� : ");
		eng = sc.nextInt();
		}while(eng < 0 || eng > 100);
		
		do {
		System.out.printf("�������� : ");
		mat = sc.nextInt();
		}while(mat < 0 || mat > 100);
		
		sum = kor + eng + mat;
		
		avg = sum/3.0f;
	
		switch((int)(avg/10)) {
		
		case 10:
		case 9:
			hak = 'A';
			break;
		case 8:
			hak = 'B';
			break;
		case 7:
			hak = 'C';
			break;
		case 6:
			hak = 'D';
			break;
		default:
			hak = 'F';
		
		System.out.println("���� : " +sum);
		System.out.printf("��� : %.2f\n"+ avg);
		System.out.println("���� : "+ hak);
		}	
	}
}
