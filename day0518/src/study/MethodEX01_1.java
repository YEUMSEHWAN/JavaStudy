package study;

public class MethodEX01_1 {

	public static void X() {
		for(int a = 0;a<5;a++) {
			System.out.print("*");
		}
		return; 
		//결과형 return값이 void 일경우 return문은 생략 가능
	}
	
	public static void main(String[] args) {
		//메소드 호출
		
		X();
		System.out.println("\nHELLO");
		
		X();
		System.out.println("\nJava");
		
		X();
		System.out.println("\n!!!!!!");
		
		
		
		
		
		
		
		
	}

}
