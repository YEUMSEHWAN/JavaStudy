package study;
/*
 * 1. -50에서 1까지의 수를 출력하는 프로그램
 * 단, 한줄에 5개씩만 출력하고, 이 수들 사리를 탭 간격으로 띄우시오.
 * 
 * 2. 콜라 사이다 마운틴 초코송이 에이스 웨하스가 나오는 자판기 프로그램을 구현하시오
 * 단,0을 입력하면 종료.
 */
public class WhileExam01 {

	public static void main(String[] args) {
		
		int a=-50;
		
		while( a<=1 ) {
			System.out.printf(a+"\t");
			a++;
			
			if(a % 5==0) {
				System.out.println();
			}
			
			
			
		}
		
		
		
	}

}
