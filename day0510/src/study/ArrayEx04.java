package study;
/*
 * ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
 * �Է¹��� ���߿��� ���� ū ���� ����ϴ� ���α׷� �ۼ�.
 * 
 * ��, �迭�� �̿��Ͽ� �����Ͻÿ�.
 * 
 * �Է��� ������ ���� : 9��
 * ������ �Է� : 4,7,9,1,3,2,5,6,8
 * ���� ū ��  : 9
 */
import java.util.*;
public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;//�Է� ������ ����� ����.(�������� ����)
		System.out.printf("�Է��� �������� ���� : ");
		n = sc.nextInt();
		
		//�Է¹��� ������ ũ�ø� ������.
		int aa[] = new int [n];
		System.out.printf("������ �Է�[���� ����] : ");
		for(int i = 0; i<aa.length;i++) {
			//�迭�� �Է¹��� ������ ����
			aa[i] = sc.nextInt();	
		}
		
		int max = 0;//���� ū ���� ����
		for(int i = 0; i<aa.length;i++) {
			//max ���� ū �� ��󳻱�
			if(aa[i]>max)
				max = aa[i];
			
			
	}
		System.out.printf("���� ū ���� : " + max);
	}
}
