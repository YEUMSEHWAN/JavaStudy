package day0428;
import java.util.*;
/*
 * ���丮���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����ڷκ��� n�̶�� �ϴ� ���� �Է¹޾� n!�� ����Ͽ� �����
 * n! = 1 * 2 * 3 * 4 * 5 * n
 */
public class Test01 {

public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
		int i;
		int n, sum;
		n=sum=0;
		
		System.out.println("���� �Է� : ");
		n = sc.nextInt();
	
		for(i=1; n>=i; i++)
			sum+= i;//(sum = sum*i)
		
		System.out.printf(n+"�� ���丮�� ����" + sum + "�Դϴ�.");
	
	}
		
}
