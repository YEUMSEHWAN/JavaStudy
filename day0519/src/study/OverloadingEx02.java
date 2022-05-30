package study;

public class OverloadingEx02 {
	
	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	public void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	public int getLength(String str) {
		
		System.out.print("입력한 값의 길이 : " + str.length());
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000);//int 형
		oe2.getLength(3.14f);//float 형
		oe2.getLength("100000");//String 형
		
		
		
		
		
	}

}
