package Music;

//�߻�Ŭ������ ��� �޾� �����ϴ� ����ü(����Ŭ��)
public class Piano extends Instrument {

	public static void main(String[] args) {
		Piano p = new Piano();// �ν��Ͻ� �޼ҵ带 ����ϱ� ���� Ŭ������ ��ü ����*

		p.play();// �ν��Ͻ� �޼ҵ� ȣ��
		p.volumeUp();
		p.volumeDown();

	}

	@Override // �������̵� �� �޼ҵ�
	void play() {// �ν��Ͻ� �޼ҵ�
		System.out.println("Piano : paly() ȣ���");
	}

	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp() ȣ���");

	}

	@Override
	void volumeDown() {
		System.out.println("Piano : volumeUp() ȣ���");

	}

}
