package day0428;
/*
 * ����ڷ� ���� ������ ������ �Է¹޾�
 * 1���� �Է¹��� �������� ��ü�� �հ�, ¦���� �հ�, Ȧ���� ���� ���� ����ϴ� ���α׷��� �����ϰ� 10������ �հ踦 ����Ͻÿ�
 * 1~10
 * 1~20
 * 1~30
 */
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, total, odd, even;
		n =total = odd = even =0;
		int i=0;
		System.out.printf("ù��° ���� : ");
		n =sc.nextInt();
		
		for(i=1; i<=n; i++) { 
			
			if(i%2==0)
				even +=i;
			else
				odd +=i;
			total=total +i;
			if(i==n) {
				System.out.println("1~"+n+"������ ��ü�� �� : "+total);
				System.out.println("1~"+n+"������ ¦���� �� : "+even);
				System.out.println("1~"+n+"������ Ȧ���� �� : "+odd);
			}	
			else if(i%10==0){
				System.out.println("1~"+i+"������ ��ü�� �� : "+ total);
				System.out.println("1~"+i+"������ ¦���� �� : "+ even);
				System.out.println("1~"+i+"������ Ȧ���� �� : "+ odd);
				System.out.println();
				
			}
		}
		
	}

}
