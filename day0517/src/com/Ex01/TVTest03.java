package com.Ex01;

public class TVTest03 {

	public static void main(String[] args) {
		TV[]tv;//��ü �迭 ����
		tv = new TV[5];
		
		
		for(int i = 0;i<tv.length;i++) {
			tv[i] = new TV();
//			tv[i].channelUp();//ä�� 1�� ����
			tv[i].channel = i+10;//tv[i]�� ä�ο� i+10�� ����
			//System.out.println();
		}
		for(int i = 0;i<tv.length;i++) {
			tv[i].channelUp();//tv[i].channelUp() �޼ҵ带 ȣ���Ͽ� ä���� 1����
			System.out.printf("tv[%d].channel = %d\n",i,tv[i].channel);
		}
		
		
	}

}
