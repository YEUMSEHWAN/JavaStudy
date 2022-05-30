package Music;

//추상클래스를 상속 받아 구현하는 구현체(하위클라스)
public class Piano extends Instrument {

	public static void main(String[] args) {
		Piano p = new Piano();// 인스턴스 메소드를 사용하기 위해 클래스의 객체 생성*

		p.play();// 인스턴스 메소드 호출
		p.volumeUp();
		p.volumeDown();

	}

	@Override // 오버라이딩 된 메소드
	void play() {// 인스턴스 메소드
		System.out.println("Piano : paly() 호출됨");
	}

	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp() 호출됨");

	}

	@Override
	void volumeDown() {
		System.out.println("Piano : volumeUp() 호출됨");

	}

}
