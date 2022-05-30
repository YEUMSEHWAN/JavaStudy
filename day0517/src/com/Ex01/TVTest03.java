package com.Ex01;

public class TVTest03 {

	public static void main(String[] args) {
		TV[]tv;//객체 배열 선언
		tv = new TV[5];
		
		
		for(int i = 0;i<tv.length;i++) {
			tv[i] = new TV();
//			tv[i].channelUp();//채널 1씩 변경
			tv[i].channel = i+10;//tv[i]의 채널에 i+10을 저장
			//System.out.println();
		}
		for(int i = 0;i<tv.length;i++) {
			tv[i].channelUp();//tv[i].channelUp() 메소드를 호출하여 채널을 1증가
			System.out.printf("tv[%d].channel = %d\n",i,tv[i].channel);
		}
		
		
	}

}
