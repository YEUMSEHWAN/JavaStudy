package study;
/*
 * �迭�� Ȱ���Ͽ� �ִ밪�� �ּҰ�
 */

import java.util.*;
public class ArrayEx03 {

	public static void main(String[] args) {
		int total[] = {79,88,91,33,100,55,95};
		
		int max = total[0];
		//�迭�� ù��° ������ �ִ밪�� �ʱ�ȭ.
		int min = total[0];
		//�迭�� ù��° ������ �ּҰ��� �ʱ�ȭ.
		
		for(int i=1;i<total.length;i++) {
			if(total[i]>max)
				max=total[i];
			else if(total[i]<min)
				min = total[i];
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
	}

}
