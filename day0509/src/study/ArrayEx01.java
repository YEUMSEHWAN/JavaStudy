package study;
import java.util.*;
public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]aa = new int[4];//������ �迭�� ����
		int sum;
		
		System.out.printf("1��° ���ڸ� �Է��ϼ��� : ");
		aa[0] = sc.nextInt();//�迭 aa[0]�� ���ڸ� �Է�
		System.out.printf("2��° ���ڸ� �Է��ϼ��� : ");
		aa[1] = sc.nextInt();//�迭 aa[1]�� ���ڸ� �Է�
		System.out.printf("3��° ���ڸ� �Է��ϼ��� : ");
		aa[2] = sc.nextInt();//�迭 aa[2]�� ���ڸ� �Է�
		System.out.printf("4��° ���ڸ� �Է��ϼ��� : ");
		aa[3] = sc.nextInt();//�迭 aa[3]�� ���ڸ� �Է�
		
		//�迭�� ����� ���ڸ� ���Ѵ�.
		sum = aa[0] + aa[1] + aa[2] + aa[3];
		
		
		System.out.printf("�հ�� ==> %d\n", sum);
	}

}
