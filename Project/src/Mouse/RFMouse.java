package Mouse;

public class RFMouse extends Mouse implements IRF {

	@Override
	public void wconnect() {// �������̽��� �޼ҵ� ������

		System.out.println("���콺 ���� �����");
	}

	@Override
	public void Wdisconnect() {// �������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� �������");
	}

	public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		System.out.println("������� : " + IRF.RF_Type_BT);//���
		rfm.wconnect();//���
		rfm.move();//���
		rfm.scroll();//���
		rfm.Wdisconnect();//���
	}

	@Override
	void move() {// �߻� Ŭ������ �޼ҵ带 ������
		System.out.println("���콺 ������");
	}

	@Override
	void scroll() {// �߻� Ŭ������ �޼ҵ带 ������
		System.out.println("���콺 ��ũ�� ����");
	}

}
