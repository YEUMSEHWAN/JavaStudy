package day0428;
/*
 * ���Ѵ�� �ΰ��� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�
*/
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2 = 0;
		int sum = 0;
		System.out.printf("ù��° ���� : ");
		n1 =sc.nextInt();
		System.out.printf("�ι�° ���� : ");
		n2 = sc.nextInt();
		
		//for(;;) {
		while(true) {	
		System.out.println("�� ���� �հ�" +sum);
			if(n1+n2==0) {
			break;	
			}
			sum = n1+n2;
			System.out.println("�����");
		}
		
		
	}

}
