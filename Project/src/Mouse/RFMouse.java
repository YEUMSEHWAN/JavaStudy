package Mouse;

public class RFMouse extends Mouse implements IRF {

	@Override
	public void wconnect() {// 인터페이스의 메소드 제정의

		System.out.println("마우스 무선 연결됨");
	}

	@Override
	public void Wdisconnect() {// 인터페이스의 메소드 제정의
		System.out.println("마우스 무선 연결끊김");
	}

	public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		System.out.println("무선방식 : " + IRF.RF_Type_BT);//출력
		rfm.wconnect();//출력
		rfm.move();//출력
		rfm.scroll();//출력
		rfm.Wdisconnect();//출력
	}

	@Override
	void move() {// 추상 클래스의 메소드를 재정의
		System.out.println("마우스 움직임");
	}

	@Override
	void scroll() {// 추상 클래스의 메소드를 재정의
		System.out.println("마우스 스크롤 동작");
	}

}
