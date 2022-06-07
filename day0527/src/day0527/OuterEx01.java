package day0527;

public class OuterEx01 {//외부

	public static class InnerEx01 {//내부
		
		static int x = 10;
		
		public static void main(String[] args) {
			OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();//객체를 만든 후 외부 메소드 호출
			
			System.out.println("oi : "+oi.x);
			System.out.println("oi : " + OuterEx01.InnerEx01.x);    
			
		}

	}

}
