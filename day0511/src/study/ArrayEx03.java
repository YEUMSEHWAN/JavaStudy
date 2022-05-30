package study;
/*
 * 배열을 활용하여 최대값과 최소값
 */

import java.util.*;
public class ArrayEx03 {

	public static void main(String[] args) {
		int total[] = {79,88,91,33,100,55,95};
		
		int max = total[0];
		//배열의 첫번째 값으로 최대값을 초기화.
		int min = total[0];
		//배열의 첫번째 값으로 최소값을 초기화.
		
		for(int i=1;i<total.length;i++) {
			if(total[i]>max)
				max=total[i];
			else if(total[i]<min)
				min = total[i];
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}

}
