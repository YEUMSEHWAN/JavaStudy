package day0428;
/*
 * �Էµ� ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�.
 * 
 * 1. ���ϸ��� �Է��� ������ ������ ����ڷ� ���� �Է� �޴´�.
 * 2. �Է¹��� ����ŭ ��հ��� ���ϸ� ����Ѵ�.
 * ��, ��հ��� �Ǽ��� ó���Ѵ�.
 */
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,count,sum=0;
		double avg =0;
		
		System.out.printf("�Է��� ������ ��� : ");
		count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			System.out.printf("���� �Է� : ");
			num1=sc.nextInt();
			sum = num1+sum;
			
			
			
		}avg = (double)sum/count;
		System.out.printf("��հ��� : %.2f\n", avg);
		
	}

}
