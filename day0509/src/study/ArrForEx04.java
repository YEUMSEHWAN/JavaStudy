package study;
import java.util.*;
/*
 * 100���� �迭 aa�� 0,2,4,8,...(2�� ���)�� �ʱ�ȭ�� ����,
 * �迭 bb�� �������� �ֱ�.
 */
public class ArrForEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�迭 aa,bb�� ����
		int []aa = new int[100];
		int bb[] = new int [100];
		
		int i;
		//�迭 aa[0],aa[2],...aa[99]�� 
		//0,2,4,..,198 �� ����/
		for (i=0;i<100;i++) {
			aa[i] = i*2;	
		}
		//�迭 bb[0]�� aa[99] �� �����ϴ� ������� ���� �������� �����Ѵ�.
		for (i=0;i<100;i++) {
			bb[i] = aa[99-i];
		}
		System.out.printf("bb[0]�� %d, bb[99]�� %d �Էµ�.",bb[0],bb[99]);
		
		
	}
	

}
