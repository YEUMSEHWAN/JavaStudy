package com.ysh.inher;

class OverridingParent {

	void parentMethod() {
		System.out.println("parentMethod...");
	}
}

class OverridingChild extends OverridingParent {

	@Override // 오버라이딩
	void parentMethod() {

		System.out.println("childMethod...");
	}

}
/*		*****오버라이딩이 성립할수 있는 규칙*****
 * ================================================================================
 * | 1. 부모클래스와 자식 클래스 사이에서만 성립한다.											  |
 * | 2. static 메소드는 클래스에 속하는 메소드 이기 때문에 상속 자체가 안된다.따라서 오버라이딩 될수 없다.  |
 * | 3. 접근 제한자가 private로 정의된 메소드는 상속 자체가 되지 않음.							  |
 * | 4. interface를 구현해서 메소드를 오버라이딩 할때는 반드시 접근제한자를 public 로 정의 해야한다.	  |
 * | 5. 메소드의 인자의 개수와 타입이 완전 일치해야하고 리턴타입까지 일치해야 한다.					  |
 * | 6. 부모 클래스의 메소드의 접근제한자보다 더 좁아질수 없다.									  |
 * | 7. 부모 클래스의 메소드 보다 더 많은 예외를 던질 수 없다.									  |
 * | 8. final(예약어) 가 지정된 메소드는 오버라이딩 할 수 없다.								  |
 * ================================================================================ 
 */
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();

	}

}
