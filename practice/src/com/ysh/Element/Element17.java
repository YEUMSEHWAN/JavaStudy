package com.ysh.Element;
//����� ���� Ŭ����

//���� �̸��� Ŭ���� �̸��� �ٸ��� ������ public�� ���ϼ� ����.
class JLocation{
	//����,�浵 ���� double Ÿ������ ����.(Ŭ���� �ٷ� �Ʒ� ������ ����(�������)�� �ڵ����� �ʱ�ȭ�Ѵ�.
	public double lat;
	public double lng;
}

public class Element17 {
	public static void main(String[] args) {
		
		//�� ���� �⺻ Ÿ��
		double latitude= 37.52127220511242;
		double longitude = 127.0074462890625;
		//����� ���� ��ü�� ����
		JLocation jloc = new JLocation();
		jloc.lat = latitude;//���� ����
		jloc.lng = longitude; // ���� ����
		
		JLocation newLoc= jloc; //��ü�� ����
		System.out.println(newLoc.lat);//���
		
	}

}
